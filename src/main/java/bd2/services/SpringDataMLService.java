package bd2.services;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.PageRequest;

import bd2.model.Category;
import bd2.model.CreditCardPayment;
import bd2.model.DeliveryMethod;
import bd2.model.OnDeliveryPayment;
import bd2.model.PaymentMethod;
import bd2.model.Product;
import bd2.model.ProductOnSale;
import bd2.model.Provider;
import bd2.model.Purchase;
import bd2.model.User;
import bd2.repositories.MLException;
import bd2.repositories.spring.*;

@Transactional
public class SpringDataMLService implements MLService {

  // OBJETO PARA DEFINIR LIMITES A QUERIES
  private PageRequest pageable;

  // REPOSITORY DEFINITIONS

  private CategoryRepository categoryRepository;

  private UserRepository userRepository;

  private ProductRepository productRepository;

  private PurchaseRepository purchaseRepository;

  private ProviderRepository providerRepository;

  private ProductOnSaleRepository productOnSaleRepository;

  private PaymentMethodRepository paymentMethodRepository;

  private DeliveryMethodRepository deliveryMethodRepository;

  private OnDeliveryPaymentRepository onDeliveryPaymentRepository;

  public CreditCardPaymentRepository creditCardPaymentRepository;

  // REPOSITORY GETTERS

  public CategoryRepository getCategoryRepository() {
    return this.categoryRepository;
  }

  public UserRepository getUserRepository() {
    return this.userRepository;
  }

  public ProductRepository getProductRepository() {
    return this.productRepository;
  }

  public PurchaseRepository getPurchaseRepository() {
    return this.purchaseRepository;
  }

  public ProviderRepository getProviderRepository() {
    return this.providerRepository;
  }

  public ProductOnSaleRepository getProductOnSaleRepository() {
    return this.productOnSaleRepository;
  }

  public PaymentMethodRepository getPaymentMethodRepository() {
    return this.paymentMethodRepository;
  }

  public DeliveryMethodRepository getDeliveryMethodRepository() {
    return this.deliveryMethodRepository;
  }

  public OnDeliveryPaymentRepository getOnDeliveryPaymentRepository() {
    return this.onDeliveryPaymentRepository;
  }

  public CreditCardPaymentRepository getCreditCardPaymentRepository() {
    return this.creditCardPaymentRepository;
  }

  @Override
  public List<Purchase> getAllPurchasesMadeByUser(String username) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<User> getUsersSpendingMoreThanInPurchase(Float amount) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<User> getUsersSpendingMoreThan(Float amount) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Provider> getTopNProvidersInPurchases(int n) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Product> getTop3MoreExpensiveProducts() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<User> getTopNUsersMorePurchase(int n) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Purchase> getPurchasesInPeriod(Date startDate, Date endDate) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Product> getProductForCategory(Category category) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Purchase> getPurchasesForProvider(Long cuit) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Product getBestSellingProduct() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Product> getProductsOnePrice() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Product> getProductWithMoreThan20percentDiferenceInPrice() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Provider getProviderLessExpensiveProduct() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Provider> getProvidersDoNotSellOn(Date day) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<ProductOnSale> getSoldProductsOn(Date day) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Product> getProductsNotSold() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DeliveryMethod getMostUsedDeliveryMethod() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OnDeliveryPayment getMoreChangeOnDeliveryMethod() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Product getHeaviestProduct() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Category getCategoryWithLessProducts() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Category createCategory(String name) throws MLException {
    Category c = new Category(name);
    this.getCategoryRepository().save(c);
    return c;
  }

  @Override
  public Product createProduct(String name, Float weight, Category category) throws MLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public User createUser(String email, String fullname, String password, Date dayOfBirth) throws MLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Provider createProvider(String name, Long cuit) throws MLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DeliveryMethod createDeliveryMethod(String name, Float cost, Float startWeight, Float endWeight)
      throws MLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CreditCardPayment createCreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv,
      String owner) throws MLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OnDeliveryPayment createOnDeliveryPayment(String name, Float promisedAmount) throws MLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ProductOnSale createProductOnSale(Product product, Provider provider, Float price, Date initialDate)
      throws MLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Purchase createPurchase(ProductOnSale productOnSale, Integer quantity, User client,
      DeliveryMethod deliveryMethod, PaymentMethod paymentMethod, String address, Float coordX, Float coordY,
      Date dateOfPurchase) throws MLException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<User> getUserByEmail(String email) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Provider> getProviderByCuit(long cuit) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Category> getCategoryByName(String name) {
    return Optional.of(this.getCategoryRepository().findByName(name));
  }

  @Override
  public Optional<Product> getProductByName(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ProductOnSale getProductOnSaleById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<DeliveryMethod> getDeliveryMethodByName(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<CreditCardPayment> getCreditCardPaymentByName(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<OnDeliveryPayment> getOnDeliveryPaymentByName(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Purchase> getPurchaseById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

}
