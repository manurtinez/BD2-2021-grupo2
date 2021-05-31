## Agregation Framework

Para todos las queries, se asume que estamos reusando la base de datos generada en la parte 3 (Índices):
Esta DB ya dispone un indice geoespacial en el atributo `location` de la colección `purchases`

```
use test
```

14. Esto puede ser logrado utilizando la funcion $sample del framework de aggregation (cuyo punto de entrada es la funcion aggregate). En nuestro caso, para seleccionar 5 es:

```
db.purchases.aggregate([{ $sample: { size: 5 } }])
````

15. En este caso, utilizando el operador $geoNear, podremos obtener los purchases que se encuentran a menos de un km de distancia de las coordenadas expresadas en $near. La distancia se anota en metros, en el operador maxDistance. Para finalizar, guardamos los resultados anteriores en una colección llamada purchasesInCaba, utilizando el operador $out:


```
db.purchases.aggregate([
   {
    $geoNear: {
        includeLocs: "location",
        distanceField: "location",
        near: {type: "Point", coordinates: [-58.4586,-34.5968]},
        maxDistance: 1000,
        spherical: true
     }
   },
   {$out: "purchasesInCaba"}
])
```

16. En la siguiente captura obtenemos la colección de productos mencionada (utilizando el stage $project para seleccionar solo el productName), y la llamamos en este caso “productsSoldInCaba”:

```
db.purchasesInCaba.aggregate([
  {$project: {_id: 0, productName: 1}},
  {$out: "productsSoldInCaba"}
])
```

17. En este inciso, utilizamos el stage $lookup que permite hacer join entre documentos de distintas colecciones. Para que la consulta sea mas eficiente, creamos un índice en productName que es el atributo por el cual se efectúan los joins.

```
db.purchases.createIndex({ productName: 1 })

db.productsSoldInCaba.aggregate([
   {
    $lookup: {
        from: "purchases",
        localField: "productName",
        foreignField: "productName",
        as: "purchases",
     }
   },
])
```

18. En el siguiente fragmento mostramos, partiendo de la query del punto anterior, de qué forma podemos obtener el promedio de costo de envío para cada producto, utilizando primero el metodo $unwind para “desempaquetar” los arrays de compras, y luego el operador $avg para calcular el promedio:

```
db.productsSoldInCaba.aggregate([
   {
    $lookup: {
        from: "purchases",
        localField: "productName",
        foreignField: "productName",
        as: "purchases",
     }
   },
   {$unwind: "$purchases"},
   {$group: {_id: "$productName", avg: {$avg: "$purchases.shippingCost"}}}
])
```


