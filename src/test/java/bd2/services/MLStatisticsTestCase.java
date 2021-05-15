package bd2.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import bd2.config.*;
import bd2.model.*;
import bd2.repositories.MLException;
import bd2.utils.DBInitializer;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { AppConfig.class, HibernateConfiguration.class,
    DBInitializerConfig.class }, loader = AnnotationConfigContextLoader.class)
@Transactional
@Rollback(true)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MLStatisticsTestCase {
  @Autowired
  DBInitializer initializer;

  @Autowired
  MLService service;

  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  @BeforeAll
  public void prepareDB() throws Exception {
    this.initializer.prepareDB();
  }

  private <T> void assertListEquality(List<T> list1, List<T> list2) {
    if (list1.size() != list2.size()) {
      Assert.fail("Lists have different size");
    }

    for (T objectInList1 : list1) {
      if (!list2.contains(objectInList1)) {
        Assert.fail(objectInList1 + " is not present in list2");
      }
    }
  }

  @Test
  public void testGetAllPurchasesMadeByUser() {
    assertEquals(5, this.service.getAllPurchasesMadeByUser("silviasez428@gmail.com").size());
  }

  @Test
  public void testGetUsersSpendingMoreThanInPurchase() {
    List<User> users = this.service.getUsersSpendingMoreThanInPurchase(Float.valueOf(920000F));
    assertEquals(3, users.size());
    this.assertListEquality(users.stream().map(property -> property.getEmail()).collect(Collectors.toList()),
        Arrays.asList("carlospascual402@hotmail.com", "matiasgarca37@hotmail.com", "maracalvo55@yahoo.com"));
  }

  @Test
  public void testGetUsersSpendingMoreThan() {
    List<User> users = this.service.getUsersSpendingMoreThan(Float.valueOf(1900000.00F));
    assertEquals(3, users.size());
    this.assertListEquality(users.stream().map(property -> property.getEmail()).collect(Collectors.toList()),
        Arrays.asList("santiagoserrano157@yahoo.com", "santiagomartin638@yahoo.com", "florenciaalonso505@yahoo.com"));
  }

  @Test
  public void testGetTopNProvidersInPurchases() {
    List<Provider> providers = this.service.getTopNProvidersInPurchases(3);
    assertEquals(3, providers.size());
    this.assertListEquality(providers.stream().map(property -> property.getName()).collect(Collectors.toList()),
        Arrays.asList("Grupo Nucleo S.A.", "Refrigeracion MG Repuestos", "Seara Refrigeración S.H."));
  }

   @Test
   public void testGetTop3MoreExpensiveProducts() {
	   List<Product> products = this.service.getTop3MoreExpensiveProducts();
	   assertEquals(3, products.size());
	   this.assertListEquality(products.stream().map(property ->
	   property.getName()).collect(Collectors.toList()),
	   Arrays.asList("Salamandra A Leña Tromen Pehuen 9500 Kcal/h 106 M2 Cuotas",
	   "Lavarropas  automático Samsung WW90J5410G inverter plata 9kg 220 V",
	   "Nebulizador a pistón Omron NE-C801 blanco 100V/240V"));
   }

  // @Test
  // public void testGetTopNUsersMorePurchase() {
  // List<User> users = this.service.getTopNUsersMorePurchase(7);
  // assertEquals(7, users.size());
  // this.assertListEquality(users.stream().map(property ->
  // property.getEmail()).collect(Collectors.toList()),
  // Arrays.asList("silviasez428@gmail.com", "matiasherrero831@gmail.com",
  // "santiagoserrano157@yahoo.com",
  // "silviaromero99@me.com", "florenciaalonso505@yahoo.com",
  // "paulacaballero154@yahoo.com",
  // "paulamorales955@yahoo.com"));

  // }

    @Test
    public void testGetPurchasesInPeriod() throws ParseException {
        List<Purchase> purchases =
                this.service.getPurchasesInPeriod(sdf.parse("8/1/2020"),
                        sdf.parse("20/01/2020"));
        assertEquals(4, purchases.size());
        this.assertListEquality(purchases.stream().map(property -> property.getAddress()).collect(Collectors.toList()),
                Arrays.asList("Calle 56 Nº1582", "Calle 51 Nº399", "Calle 44 Nº812", "Calle 52 Nº816"));
    }

  @Test
  public void testGetProductForCategory() throws MLException {
    Optional<Category> oc = this.service.getCategoryByName("Calderas");
    if (!oc.isPresent()) {
      throw new MLException("Category not found");
    }
    Category cat = oc.get();
    List<Product> products = this.service.getProductForCategory(cat);
    assertEquals(4, products.size());
    this.assertListEquality(products.stream().map(property ->
                    property.getName()).collect(Collectors.toList()),
            Arrays.asList("Caldera Peisa Diva Duo Ds 32000 Kcal Tiro Forzado",
                    "Caldera Mural Orbis 230cto Solo Calefaccion 29000 Kcal Tiro Natural Con Envio",
                    "Caldera Mural Orbis 230cto Calefaccion 30000 Kcal + Envio",
                    "Caldera A Gas Baxi Eco 4s 24 Doble Servicio Tiro Forzado"));
  }

  // @Test
  // public void testGetPurchasesForProvider() {
  // List<Purchase> purchases =
  // this.service.getPurchasesForProvider(21859773715L);
  // assertEquals(3, purchases.size());
  // this.assertListEquality(purchases.stream().map(property ->
  // property.getAddress()).collect(Collectors.toList()),
  // Arrays.asList("Calle 40 Nº137", "Calle 57 Nº1637", "Calle 62 Nº1158"));
  // }

  // @Test
  // public void testGetBestSellingProduct() {
  // Product product = this.service.getBestSellingProduct();
  // assertEquals(product.getName(), "Lavarropas automático Samsung WW90J5410G
  // inverter plata 9kg 220 V");
  // }

  // @Test
  // public void testGetProductsOnePrice() {
  // List<Product> products = this.service.getProductsOnePrice();
  // assertEquals(12, products.size());
  // }

  // @Test
  // public void testGetProviderLessExpensiveProduct() {
  // Provider provider = this.service.getProviderLessExpensiveProduct();
  // assertEquals(Long.valueOf(20535001383L), provider.getCuit());
  // }

  // @Test
  // public void testGetProvidersDoNotSellOn() throws ParseException {
  // List<Provider> providers =
  // this.service.getProvidersDoNotSellOn(sdf.parse("29/01/2020"));
  // assertEquals(16, providers.size());
  // }

  // @Test
  // public void testGetSoldProductsOn() throws ParseException {
  // List<ProductOnSale> products =
  // this.service.getSoldProductsOn(sdf.parse("07/11/2019"));
  // assertEquals(3, products.size());
  // this.assertListEquality(
  // products.stream().map(property ->
  // property.getProduct().getName()).collect(Collectors.toList()),
  // Arrays.asList("Anafe eléctrico Ultracomb AN-2211 negro 220V",
  // "Cocina Escorial Candor S2 multigas 4 hornallas blanca 220V puerta con
  // visor",
  // "Lavavajillas Drean Dish 15.2 DT de 15 cubiertos blanco 220V"));
  // }

  // @Test
  // public void testGetProductsNotSold() {
  // List<Product> products = this.service.getProductsNotSold();
  // assertEquals(49, products.size());
  // }

  // @Test
  // public void testGetMostUsedDeliveryMethod() {
  // DeliveryMethod dm = this.service.getMostUsedDeliveryMethod();
  // assertEquals("Flete", dm.getName());
  // }

  // @Test
  // public void testGetMoreChangeOnDeliveryMethod() {
  // OnDeliveryPayment odp = this.service.getMoreChangeOnDeliveryMethod();
  // assertEquals("Pago Efectivo pos072", odp.getName());
  // }

  // @Test
  // public void testGetProductWithMoreThan20percentDiferenceInPrice() {
  // List<Product> products =
  // this.service.getProductWithMoreThan20percentDiferenceInPrice();
  // assertEquals(29, products.size());
  // }

  // @Test
  // public void testGetHeaviestProduct() {
  // Product product = this.service.getHeaviestProduct();
  // assertEquals("Lavavajillas Drean Dish 15.2 DT de 15 cubiertos blanco 220V",
  // product.getName());
  // }

  // @Test
  // public void testGetCategoryWithLessProducts() {
  // Category category = this.service.getCategoryWithLessProducts();
  // assertEquals("Calderas", category.getName());
  // }
}
