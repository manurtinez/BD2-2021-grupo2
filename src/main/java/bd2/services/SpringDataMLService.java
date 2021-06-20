package bd2.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

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
  // REPOSITORY DEFINITIONS

  @Inject
  private CategoryRepository categoryRepository;

  @Inject
  private UserRepository userRepository;
  @Inject
  private ProductRepository productRepository;
  @Inject
  private PurchaseRepository purchaseRepository;
  @Inject
  private ProviderRepository providerRepository;
  @Inject
  private ProductOnSaleRepository productOnSaleRepository;
  @Inject
  private PaymentMethodRepository paymentMethodRepository;
  @Inject
  private DeliveryMethodRepository deliveryMethodRepository;
  @Inject
  private OnDeliveryPaymentRepository onDeliveryPaymentRepository;
  @Inject
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
    return this.userRepository.getAllPurchasesMadeByUser(username);
  }

  @Override
  public List<User> getUsersSpendingMoreThanInPurchase(Float amount) {
    return this.userRepository.getUsersSpendingMoreThanInPurchase(amount);
  }

  @Override
  public List<User> getUsersSpendingMoreThan(Float amount) {
    return this.userRepository.getUsersSpendingMoreThan(amount);
  }

  @Override
  public List<Provider> getTopNProvidersInPurchases(int n) {
    return this.providerRepository.getTopNProvidersInPurchases(PageRequest.of(0, n));
  }

  @Override
  public List<Product> getTop3MoreExpensiveProducts() {
    return this.productRepository.getTop3MoreExpensiveProducts(PageRequest.of(0, 3));
  }

  @Override
  public List<User> getTopNUsersMorePurchase(int n) {
    return this.userRepository.getTopNUsersMorePurchase(PageRequest.of(0, n));
  }

  @Override
  public List<Purchase> getPurchasesInPeriod(Date startDate, Date endDate) {
    return this.purchaseRepository.getPurchasesInPeriod(startDate, endDate);
  }

  @Override
  public List<Product> getProductForCategory(Category category) {
    return this.productRepository.getProductForCategory(category);
  }

  @Override
  public List<Purchase> getPurchasesForProvider(Long cuit) {
    return this.purchaseRepository.getPurchasesForProvider(cuit);
  }

  @Override
  public Product getBestSellingProduct() {
    return this.productRepository.getBestSellingProduct(PageRequest.of(0, 1)).getContent().get(0);
  }

  @Override
  public List<Product> getProductsOnePrice() {
    return this.productRepository.getProductsOnePrice();
  }

  @Override
  public List<Product> getProductWithMoreThan20percentDiferenceInPrice() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Provider getProviderLessExpensiveProduct() {
    return this.providerRepository.getProviderLessExpensiveProduct(PageRequest.of(0, 1)).getContent().get(0);
  }

  @Override
  public List<Provider> getProvidersDoNotSellOn(Date day) {
    return this.providerRepository.getProvidersDoNotSellOn(day);
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
    return this.deliveryMethodRepository.getMostUsedDeliveryMethod(PageRequest.of(0, 1)).getContent().get(0);
  }

  @Override
  public OnDeliveryPayment getMoreChangeOnDeliveryMethod() {
    return this.onDeliveryPaymentRepository.getMoreChangeOnDeliveryMethod(PageRequest.of(0, 1)).getContent().get(0);
  }

  @Override
  public Product getHeaviestProduct() {
    return this.productRepository.findTop1ByOrderByWeightDesc();
  }

  @Override
  public Category getCategoryWithLessProducts() {
    return this.getCategoryRepository().getCategoryWithLessProducts(PageRequest.of(0, 1)).getContent().get(0);
  }

  @Override
  public Category createCategory(String name) throws MLException {
    Category c = new Category(name);
    this.getCategoryRepository().save(c);
    return c;
  }

  @Override
  public Product createProduct(String name, Float weight, Category category) throws MLException {
    if (this.productRepository.findByName(name) != null) {
      throw new MLException("Constraint Violation");
    }
    Product p = new Product(name, weight, category);
    this.getProductRepository().save(p);
    return p;
  }

  @Override
  public User createUser(String email, String fullname, String password, Date dayOfBirth) throws MLException {
    if (this.userRepository.findByEmail(email) != null) {
      throw new MLException("Constraint Violation");
    }
    User user = new User(email, fullname, password, dayOfBirth);
    return (User) this.userRepository.save(user);
  }

  @Override
  public Provider createProvider(String name, Long cuit) throws MLException {

    if (this.providerRepository.findByCuit(cuit) != null) {
      throw new MLException("Constraint Violation");
    }
    Provider pr = new Provider(name, cuit);
    this.getProviderRepository().save(pr);
    return pr;
  }

  @Override
  public DeliveryMethod createDeliveryMethod(String name, Float cost, Float startWeight, Float endWeight)
      throws MLException {
	if (this.deliveryMethodRepository.findByName(name) != null) {
	      throw new MLException("Constraint Violation");
	 }
    DeliveryMethod dm = new DeliveryMethod(name, cost, startWeight, endWeight);
    this.deliveryMethodRepository.save(dm);
    return dm;
  }

  @Override
  public CreditCardPayment createCreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv,
      String owner) throws MLException {

    if (this.creditCardPaymentRepository.findByName(name) != null) {
      throw new MLException("Constraint Violation");
    }
    CreditCardPayment ccp = new CreditCardPayment(name, brand, number, expiry, cvv, owner);
    this.getCreditCardPaymentRepository().save(ccp);
    return ccp;
  }

  @Override
  public OnDeliveryPayment createOnDeliveryPayment(String name, Float promisedAmount) throws MLException {

    if (this.onDeliveryPaymentRepository.findByName(name) != null) {
      throw new MLException("Constraint Violation");
    }
    OnDeliveryPayment dp = new OnDeliveryPayment(name, promisedAmount);
    this.getOnDeliveryPaymentRepository().save(dp);
    return dp;
  }

  @Override
  public ProductOnSale createProductOnSale(Product product, Provider provider, Float price, Date initialDate)
      throws MLException {
    if (!this.productOnSaleRepository.hasNewerProductOnSaleVersion(PageRequest.of(0, 1), product, provider, initialDate)
        .getContent().isEmpty()) {
      throw new MLException(
          "Ya existe un precio para el producto con fecha de inicio de vigencia posterior a la fecha de inicio dada");
    }
    List<ProductOnSale> resultList = this.productOnSaleRepository
        .getLastProductOnSaleVersion(PageRequest.of(0, 1), product, provider).getContent();
    if (!resultList.isEmpty()) {
      ProductOnSale oldPos = resultList.get(0);
      oldPos.setFinalDate(initialDate);
      this.productOnSaleRepository.save(oldPos);
    }
    ProductOnSale pos = new ProductOnSale(product, provider, price, initialDate);
    return (ProductOnSale) this.productOnSaleRepository.save(pos);
  }

  @Override
  public Purchase createPurchase(ProductOnSale productOnSale, Integer quantity, User client,
      DeliveryMethod deliveryMethod, PaymentMethod paymentMethod, String address, Float coordX, Float coordY,
      Date dateOfPurchase) throws MLException {
    // Chequear que el delivery method soporta el peso de los productos
    if (productOnSale.getProduct().getWeight() * quantity > deliveryMethod.getEndWeight()) {
      throw new MLException("método de delivery no válido");
    }
    Purchase pur = new Purchase(productOnSale, quantity, client, deliveryMethod, paymentMethod, address, coordX, coordY,
        dateOfPurchase);
    return (Purchase) this.purchaseRepository.save(pur);
  }

  @Override
  public Optional<User> getUserByEmail(String email) {
    return Optional.of(this.userRepository.findByEmail(email));
  }

  @Override
  public Optional<Provider> getProviderByCuit(long cuit) {
    return Optional.of(this.getProviderRepository().findByCuit(cuit));
  }

  @Override
  public Optional<Category> getCategoryByName(String name) {
    return Optional.of(this.getCategoryRepository().findByName(name));
  }

  @Override
  public Optional<Product> getProductByName(String name) {
    return Optional.of(this.getProductRepository().findByName(name));
  }

  @Override
  public ProductOnSale getProductOnSaleById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<DeliveryMethod> getDeliveryMethodByName(String name) {
    return this.getDeliveryMethodRepository().findByName(name);
  }

  @Override
  public Optional<CreditCardPayment> getCreditCardPaymentByName(String name) {
    // TODO Auto-generated method stub
    return Optional.of(this.getCreditCardPaymentRepository().findByName(name));
  }

  @Override
  public Optional<OnDeliveryPayment> getOnDeliveryPaymentByName(String name) {
    return Optional.of(this.getOnDeliveryPaymentRepository().findByName(name));
  }

  @Override
  // Este método no es usado en los tests
  public Optional<Purchase> getPurchaseById(Long id) {
    return Optional.empty();
  }

}
