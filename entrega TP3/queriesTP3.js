// SE INDICAN LAS QUERIES USADAS EN EL TP SEPARADAS POR CONSIGNA:

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

// PARTE 3: Índices
 
// 11) En la colección de compras se encuentra un índice definido para la clave primaria (_id)
// que por defecto asigna MongoDB a todo documento.

// 12)

db.purchases.find({productName: "Producto 11"}).explain("executionStats")

// 13) 

db.purchases.find({location: {$geoWithin: {$geometry: cabaLocation}}}).explain("executionStats")
