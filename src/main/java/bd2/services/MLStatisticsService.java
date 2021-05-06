package bd2.services;

import java.util.Date;
import java.util.List;

import bd2.model.Category;
import bd2.model.DeliveryMethod;
import bd2.model.OnDeliveryPayment;
import bd2.model.Product;
import bd2.model.ProductOnSale;
import bd2.model.Provider;
import bd2.model.Purchase;
import bd2.model.User;

public interface MLStatisticsService {

  /**
   * @param username
   * @return Una lista con todas las compras realizadas por el usuario con
   *         username <code>username</code>
   */
  List<Purchase> getAllPurchasesMadeByUser(String username);

  /**
   * @param amount
   * @return una lista de los usuarios que han gastando más de <code>amount</code>
   *         en alguna compra en la plataforma
   */
  List<User> getUsersSpendingMoreThanInPurchase(Float amount);

  /**
   * @param amount
   * @return una lista de los usuarios que han gastando más de <code>amount</code>
   *         entre todas sus compras en la plataforma
   */
  List<User> getUsersSpendingMoreThan(Float amount);

  /**
   * @param n
   * @return una lista con los <code>n</code> proveedores que más productos han
   *         vendido
   */
  List<Provider> getTopNProvidersInPurchases(int n);

  /**
   * @return una lista con los 3 productos diferentes más costosos
   */
  List<Product> getTop3MoreExpensiveProducts();

  /**
   * @param n
   * @return una lista con los <code>n</code> usuarios que más cantidad de compras
   *         han realizado
   */
  List<User> getTopNUsersMorePurchase(int n);

  /**
   * @param startDate
   * @param endDate
   * @return una lista con las compras realizadas entre dos fechas
   */
  List<Purchase> getPurchasesInPeriod(Date startDate, Date endDate);

  /**
   * @param category
   * @return una lista con todos los productos de la categoría
   *         <code> category </code>
   */
  List<Product> getProductForCategory(Category category);

  /**
   * @param cuit
   * @return una lista de las compras realizadas por el proveedor con cuit
   *         <code>cuit</code>
   */
  List<Purchase> getPurchasesForProvider(Long cuit);

  /**
   * @return el producto con más demanda independientemente del proveedor que lo
   *         venda
   */
  Product getBestSellingProduct();

  /**
   * @return una lista de productos que no cambiaron su precio independientemente
   *         del proveedor que lo venda
   */
  List<Product> getProductsOnePrice();

  /**
   * @return una lista de productos cuya diferencia de precio entre el proveedor
   *         más barato y el más caro es superior al 20%
   */
  List<Product> getProductWithMoreThan20percentDiferenceInPrice();

  /**
   * @return el proveedor con el producto de menor valor de los ofrecidos
   *         actualmente en la plataforma
   */
  Provider getProviderLessExpensiveProduct();

  /**
   * @param day
   * @return una lista de proveedores que no vendieron productos en un
   *         <code>day</code>
   */
  List<Provider> getProvidersDoNotSellOn(Date day);

  /**
   * @param day
   * @return una lista los productOnSale vendidos en un <code>day</code>
   */
  List<ProductOnSale> getSoldProductsOn(Date day);

  /**
   * @return la lista de productos que no se han vendido independientemente del
   *         proveedor que los ofrece
   */
  List<Product> getProductsNotSold();

  /**
   * @return el método de Delivery más utilizado
   */
  DeliveryMethod getMostUsedDeliveryMethod();

  /**
   * @return el onDeliveryPayment que mayor vuelto debe dar
   */
  OnDeliveryPayment getMoreChangeOnDeliveryMethod();

  /**
   * @return el producto más pesado
   */
  Product getHeaviestProduct();

  /**
   * 
   * @return la categoría con menor cantidad de productos
   */
  Category getCategoryWithLessProducts();
}
