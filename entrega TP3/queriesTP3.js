// SE INDICAN LAS QUERIES USADAS EN EL TP SEPARADAS POR CONSIGNA:

// PARTE 2: Primeros pasos con MongoDB.

// 5)

// Crear DB
db.dropDatabase() // en caso de confundirse

use ecommerce

// Crear coleccion
db.createCollection("products")

// ver colecciones
db.getCollectionNames()

// insertar documento
db.products.insertOne({
	name: "Caldera Caldaia Duo",
	price: 140000,
})

// recuperar (todos) los documentos
db.products.find().pretty()

// 6)

// insertar varios documentos
db.products.insertMany([
	{name:"Caldera Orbis 230", price:77000, tags: ["gas", "digital"]},
	{name:"Caldera Ariston Clas", price:127000, tags: ["gas envasado", "termostato"]},
	{name:"Caldera Caldaia S30", price:133000},
	{name:"Caldera Mural Orbis 225cto", price:100000, tags: ["gas", "digital", "termostato"]} 
])

// recuperar productos de $100.000 o MENOS
db.products.find({
	price: {
		$lte: 100000,
	}
})

// productos con etiqueta "digital"
db.products.find({
	tags: "digital"
})

// no tienen etiquetas (atributo ausente)
db.products.find({
	tags: {
		$exists: false,
	}
})

// incluyen "Orbis" en el nombre
db.products.find({
	"name": {
		$regex: /Orbis/,
	}
})

// incluyen "Orbis" en el nombre y cuestan menos de $100.000
db.products.find({
	name: {
		$regex: /Orbis/,
	},
	price: {
		$lt: 100000,
	}
})

// misma que anterior pero solo proyecta el nombre
db.products.find({
	name: {
		$regex: /Orbis/,
	},
	price: {
		$lt: 100000,
	}
},
{
	name: true,
	_id: false,
})

// 7)

// actualizar precio de "Caldera Caldaia S30" a $150.000
db.products.updateOne({
	name: "Caldera Caldaia S30"
},
{
	$set: {
		price: 150000,
	}
})

// crear array de tags para el mismo producto
db.products.updateOne({
	name: "Caldera Caldaia S30"
},
{
	$set: {
		tags: [],
	}
})

// agregar el tag "digital" al mismo producto
db.products.updateOne({
	name: "Caldera Caldaia S30"
},
{
	$push: {
		tags: "digital",
	}
})

// incrementa en 10% el precio de todas las calderas con tag "digital"
db.products.updateMany({
	tags: "digital",
},
{
	$mul: {
		price: 1.1,
	}
})


// PARTE 3: Índices.

// 12)

db.purchases.find({productName: "Producto 11"}).explain("executionStats")

// 13)

// geojson dado por la cátedra
var cabaLocation = {
	"type":"MultiPolygon",
	"coordinates":[[[
	  [-58.46305847167969,-34.53456089748654],
	  [-58.49979400634765,-34.54983198845187],
	  [-58.532066345214844,-34.614561581608186],
	  [-58.528633117675774,-34.6538270014492],
	  [-58.48674774169922,-34.68742794931483],
	  [-58.479881286621094,-34.68206400648744],
	  [-58.46855163574218,-34.65297974261105],
	  [-58.465118408203125,-34.64733112904415],
	  [-58.4585952758789,-34.63998735602951],
	  [-58.45344543457032,-34.63603274732642],
	  [-58.447265625,-34.63575026806082],
	  [-58.438339233398445,-34.63038297923296],
	  [-58.38100433349609,-34.62162507826766],
	  [-58.38237762451171,-34.59251960889388],
	  [-58.378944396972656,-34.5843230246475],
	  [-58.46305847167969,-34.53456089748654]
	]]]
   }

// query
db.purchases.find({location: {$geoWithin: {$geometry: cabaLocation}}}).explain("executionStats")
