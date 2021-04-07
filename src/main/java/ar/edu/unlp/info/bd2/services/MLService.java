package ar.edu.unlp.info.bd2.services;
import ar.edu.unlp.info.bd2.model.*;
import ar.edu.unlp.info.bd2.repositories.MLException;

import java.util.Date;
import java.util.Optional;


public interface MLService {
    
	/**
	 * Crea y devuelve una nueva Catogoria
	 * @param name nombre del producto a ser creado
	 * @return la categoria creada
	 * @throws MLException 
	 */
	Category createCategory(String name) throws MLException;
	
	/**
	 *  Crea y devuelve un nuevo Producto.
	 * @param name nombre del producto a ser creado
	 * @param weight peso actual del producto
	 * @param category categor{ia del producto
	 * @return el producto creado
	 * @throws MLException 
	 */
	Product createProduct(String name, Float weight, Category category) throws MLException;
	
	/**
	 * 
	 * @param email email del usuario con el cual ingresa al sitio
	 * @param fullname nombre y apellido del usuario
	 * @param password clave con la que el usuario ingresa al sitio
	 * @param dayOfBirth fecha de nacimiento del usuario
	 * @return el usuario creado
	 * @throws MLException 
	 */
	User createUser(String email, String fullname, String password, Date dayOfBirth) throws MLException;
	
	/**
	 * 
	 * @param name nombre del proveedor
	 * @param cuit cuil del proveedor
	 * @return el proveedor creado
	 * @throws MLException 
	 */
	Provider createProvider(String name, Long cuit) throws MLException;
	
	/**
	 * 
	 * @param name nombre del método de delivery
	 * @param cost precio del delivery
	 * @param startWeight peso mínimo del producto admitido para este costo
	 * @param endWeight peso máximo del producto admitido para este costo
	 * @return el método de delivery creado
	 * @throws MLException 
	 */
	DeliveryMethod createDeliveryMethod(String name, Float cost, Float startWeight, Float endWeight) throws MLException;
	
	/**
	 * 
	 * @param name nombre del método de pago
	 * @param brand marca de la tarjeta
	 * @param number número de la tarjeta
	 * @param expiry fecha de expiración de la tarjeta
	 * @param cvv código de validación de la tarjeta
	 * @param owner nombre del titular de la tarjeta
	 * @return el método de pago creado
	 * @throws MLException 
	 */
	CreditCardPayment createCreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv, String owner) throws MLException;
	
	/**
	 * 
	 * @param name nombre del método de pago
	 * @param promisedAmount monto con el que va a pagar el cliente
	 * @return el método de pago creado
	 * @throws MLException 
	 */
	OnDeliveryPayment createOnDeliveryPayment(String name, Float promisedAmount) throws MLException;
	
	/**
	 * 
	 * @param product producto al cual se le va a dar precio
	 * @param provider proveedor del producto al cual se le va a dar precio
	 * @param price precio del producto
	 * @param initialDate fecha desde cuando el producto vale ese precio
	 * @return el precio para el producto
	 * @implNote si el producto ya tiene un precio para el proveedor se actualiza la fecha de fin en un día antes a la initialDate
	 *  y se el crea el nuevo precio
	 * @throws MLException si initialDate es anterior a la initialDate actual. 
	 */
	ProductOnSale createProductOnSale(Product product, Provider provider, Float price, Date initialDate) throws MLException;
	
	/**
	 * 
	 * @param productOnSale producto que se compra
	 * @param quantity cantidad de producto que compra
	 * @param client usuario que realiza la compra
	 * @param deliveryMethod método de delivery
	 * @param paymentMethod método de pago
	 * @param address dirección en la cual se debe entregar el pedido
	 * @param coordX coordenada X de la dirección de entrega
	 * @param coordY coordeada Y de la dirección de entrega
	 * @param dateOfPurchase fecha de la compra
	 * @return la compra creada
	 * @throws MLException si el método de delivery enviado no se corresponde con el peso de la compra
	 */
	Purchase createPurchase(ProductOnSale productOnSale, Integer quantity, User client, DeliveryMethod deliveryMethod,
			PaymentMethod paymentMethod, String address, Float coordX, Float coordY, Date dateOfPurchase) throws MLException;
	

	/**
	 * 
	 * @param email email del usuario
	 * @return
	 */
	Optional<User> getUserByEmail(String email);

	/**
	 * 
	 * @param cuit cuit del proveedor
	 * @return
	 */
	Optional<Provider> getProviderByCuit(long cuit);
	
	/**
	 * 
	 * @param name nombre de la categoria a buscar
	 * @return
	 */
	Optional<Category> getCategoryByName(String name);

	/**
	 *
	 * @param name nombre del producto a buscar
	 * @return
	 */
	Optional<Product> getProductByName(String name);

	/**
	 *
	 * @param id del producto en venta a buscar
	 * @return
	 */
	ProductOnSale getProductOnSaleById(Long id);

	/**
	 * 
	 * @param name nombre del método de delivery a buscar
	 * @return
	 */
	Optional<DeliveryMethod> getDeliveryMethodByName(String name);

	/**
	 * 
	 * @param name	nombre del pago con tarjeta
	 * @return
	 */
	Optional<CreditCardPayment> getCreditCardPaymentByName(String name);

	/**
	 * 
	 * @param name	Nombre del Pago en Delivery a buscar
	 * @return
	 */
	Optional<OnDeliveryPayment> getOnDeliveryPaymentByName(String name);

	/**
	 * 
	 * @param id el id de la compra
	 * @return
	 */
	Optional<Purchase> getPurchaseById(Long id);
	

}
