## Primer paso: dependencias

El primer paso que tomamos al empezar, fue agregar las dependencias necesarias para el manejo de elastic search
mediante spring data ([solo una](https://mvnrepository.com/artifact/org.springframework.data/spring-data-elasticsearch) es necesaria), y quitar las dependencias que no se usarian, como las de mysql, mongo e hibernate.

## Segundo paso: configuracion

Luego, habia que modificar la configuracion del proyecto, ya que el motor de BD seria diferente. Mediante [docker-compose](https://docs.docker.com/compose/compose-file/compose-file-v3/), creamos un
"cluster" (entre comillas ya que cuenta con un solo nodo) de elastic search, y agregamos el archivo [`application.properties`](https://www.tutorialspoint.com/spring_boot/spring_boot_application_properties.htm) para que spring
sepa como conectarse al mismo. No hacia falta mas el archivo de config de hibernate, y fue reemplazado por uno para elastic, `ElasticConfig.java`

## Tercer paso: migrar modelo

[Referencia](https://www.elastic.co/es/blog/managing-relations-inside-elasticsearch)

Lo siguiente era migrar el modelo. Lo mas importante fue convertir las relaciones, ya que en elastic, al estar orientado a documentos,
no tiene concepto de relaciones entre tablas, sino que maneja un modelo "aplanado", es decir, objetos que pueden tener otros objetos anidados.
Las relaciones ManyToOne y OneToMany fueron convertidas para ser Padre-Hijo, es decir, el objeto del lado de One toma el rol de padre, teniendo
un arreglo de hijos (los objetos del lado de Many). Ambos se conocen uno a otros, para el caso de que los hijos, por ejemplo, necesiten datos del
padre.

En el caso de las tablas Join (solo teniamos una), elastic provee el [tipo Join](https://www.elastic.co/guide/en/elasticsearch/reference/current/parent-join.html), que cumple mas o menos la misma funcion, es decir, ser
intermediario entre 2 clases diferentes que se conocen. Estos tambien toman rol padre-hijo, pero se usa para objetos del mismo index.

## Cuarto paso? Modificar servicios y (tal vez) repos

Algunos cambios necesitaban ser hechos en los servicios y repositorios, ya que ahora, al no tener relaciones, algunos objetos necesitaban
ser creados e indexados manualmente. Sin embargo, aca empezamos a encontrar problemas al intentar levantar el proyecto solo con los cambios al modelo.

# PROBLEMASSS

Los probemas mas comunes que encomtramos fueron problemas al crear beans, problemas de dependencias, errores de configuracion, y diversos errores del
contexto de aplicacion de spring los cuales no pudimos solucionar hasta ahora.
