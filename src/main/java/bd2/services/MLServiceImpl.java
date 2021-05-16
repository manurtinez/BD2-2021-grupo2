package bd2.services;

import bd2.model.*;
import bd2.repositories.MLException;
import bd2.repositories.MLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MLServiceImpl implements MLService {

    /**
     * Constructor
     */
    @Autowired
    MLRepository repository;

    public MLServiceImpl(MLRepository repository) {

    }

    @Override
    public Category createCategory(String name) throws MLException {
        Category c = new Category(name);
        return (Category) this.repository.save(c);
    }

    @Override
    public Optional<Category> getCategoryByName(String name) {
        return Optional.of(this.repository.getCategoryByName(name));
    }

    @Override
    public Product createProduct(String name, Float weight, Category category) throws MLException {
        if (this.repository.getProductByName(name) != null) {
            throw new MLException("Constraint Violation");
        }
        Product p = new Product(name, weight, category);
        return (Product) this.repository.save(p);
    }

    @Override
    public Optional<Product> getProductByName(String name) {
        return Optional.of(this.repository.getProductByName(name));
    }

    @Override
    @Transactional
    public User createUser(String email, String fullname, String password, Date dayOfBirth) throws MLException {
        if (this.repository.getUserByEmail(email) != null) {
            throw new MLException("Constraint Violation");
        }
        User user = new User(email, fullname, password, dayOfBirth);
        return (User) this.repository.save(user);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return Optional.of(this.repository.getUserByEmail(email));
    }

    @Override
    public Provider createProvider(String name, Long cuit) throws MLException {
        if (this.repository.getProviderByCuit(cuit) != null) {
            throw new MLException("Constraint Violation");
        }

        Provider prov = new Provider(name, cuit);
        return (Provider) this.repository.save(prov);
    }

    @Override
    public DeliveryMethod createDeliveryMethod(String name, Float cost, Float startWeight, Float endWeight)
            throws MLException {
        // if (this.repository.getDeliveryMethodByName(name) != null) {
        // throw new MLException("Constraint Violation");
        // }
        DeliveryMethod dm = new DeliveryMethod(name, cost, startWeight, endWeight);
        return (DeliveryMethod) this.repository.save(dm);
    }

    @Override
    public CreditCardPayment createCreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv,
            String owner) throws MLException {
        CreditCardPayment ccp = new CreditCardPayment(name, brand, number, expiry, cvv, owner);
        return (CreditCardPayment) this.repository.save(ccp);
    }

    @Override
    public OnDeliveryPayment createOnDeliveryPayment(String name, Float promisedAmount) throws MLException {
        // if (this.repository.getOnDeliveryPaymentByName(name) != null) {
        // throw new MLException("Constraint Violation");
        // }
        OnDeliveryPayment omp = new OnDeliveryPayment(name, promisedAmount);
        return (OnDeliveryPayment) this.repository.save(omp);
    }

    @Override
    public ProductOnSale createProductOnSale(Product product, Provider provider, Float price, Date initialDate)
            throws MLException {
        if (this.repository.hasNewerProductOnSaleVersion(product, provider, initialDate)) {
            throw new MLException(
                    "Ya existe un precio para el producto con fecha de inicio de vigencia posterior a la fecha de inicio dada");
        }
        Optional<ProductOnSale> oldPos = this.repository.getLastProductOnSaleVersion(product, provider);
        if (oldPos.isPresent()) {
            Calendar cal = Calendar.getInstance();
            oldPos.get().setFinalDate(initialDate);
            this.repository.update(oldPos.get());
        }
        ProductOnSale pos = new ProductOnSale(product, provider, price, initialDate);
        return (ProductOnSale) this.repository.save(pos);
    }

    @Override
    public Purchase createPurchase(ProductOnSale productOnSale, Integer quantity, User client,
            DeliveryMethod deliveryMethod, PaymentMethod paymentMethod, String address, Float coordX, Float coordY,
            Date dateOfPurchase) throws MLException {
        // Chequear que el delivery method soporta el peso de los productos
        if (productOnSale.getProduct().getWeight() * quantity > deliveryMethod.getEndWeight()) {
            throw new MLException("método de delivery no válido");
        }
        Purchase pur = new Purchase(productOnSale, quantity, client, deliveryMethod, paymentMethod, address, coordX,
                coordY, dateOfPurchase);
        return (Purchase) this.repository.save(pur);
    }

    @Override
    public Optional<Provider> getProviderByCuit(long cuit) {
        return Optional.of(this.repository.getProviderByCuit(cuit));
    }

    @Override
    public ProductOnSale getProductOnSaleById(Long id) {
        return null;
    }

    public Optional<DeliveryMethod> getDeliveryMethodByName(String name) {
        return Optional.of(this.repository.getDeliveryMethodByName(name));
    }

    @Override
    public Optional<CreditCardPayment> getCreditCardPaymentByName(String name) {
        return Optional.of(this.repository.getCreditCardPaymentByName(name));
    }

    @Override
    public Optional<OnDeliveryPayment> getOnDeliveryPaymentByName(String name) {
        return Optional.of(this.repository.getOnDeliveryPaymentByName(name));
    }

    @Override
    public Optional<Purchase> getPurchaseById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Purchase> getAllPurchasesMadeByUser(String username) {
        return this.repository.getAllPurchasesMadeByUser(username);
    }

    @Override
    public List<User> getUsersSpendingMoreThanInPurchase(Float amount) {
        return this.repository.getUsersSpendingMoreThanInPurchase(amount);
    }

    @Override
    public List<User> getUsersSpendingMoreThan(Float amount) {
        return this.repository.getUsersSpendingMoreThan(amount);
    }

    @Override
    public List<Provider> getTopNProvidersInPurchases(int n) {
        return this.repository.getTopNProvidersInPurchases(n);
    }

    @Override
    public List<Product> getTop3MoreExpensiveProducts() {
        return this.repository.getTop3MoreExpensiveProducts();
    }

    @Override
    public List<User> getTopNUsersMorePurchase(int n) {
        return this.repository.getTopNUsersMorePurchase(n);
    }

    @Override
    public List<Purchase> getPurchasesInPeriod(Date startDate, Date endDate) {
        return this.repository.getPurchasesInPeriod(startDate, endDate);
    }

    @Override
    public List<Product> getProductForCategory(Category category) {
        return this.repository.getProductForCategory(category);
    }

    @Override
    public List<Purchase> getPurchasesForProvider(Long cuit) {
        return this.repository.getPurchasesForProvider(cuit);
    }

    @Override
    public Product getBestSellingProduct() {
        return this.repository.getBestSellingProduct();
    }

    @Override
    public List<Product> getProductsOnePrice() {
        return this.repository.getProductsOnePrice();
    }

    @Override
    public List<Product> getProductWithMoreThan20percentDiferenceInPrice() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Provider getProviderLessExpensiveProduct() {
        return this.repository.getProviderLessExpensiveProduct();
    }

    @Override
    public List<Provider> getProvidersDoNotSellOn(Date day) {
        return this.repository.getProvidersDoNotSellOn(day);
    }

    @Override
    public List<ProductOnSale> getSoldProductsOn(Date day) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getProductsNotSold() {
        return this.repository.getProductsNotSold();
    }

    @Override
    public DeliveryMethod getMostUsedDeliveryMethod() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public OnDeliveryPayment getMoreChangeOnDeliveryMethod() {
        return this.repository.getMoreChangeOnDeliveryMethod();
    }

    @Override
    public Product getHeaviestProduct() {
        return this.repository.getHeaviestProduct();
    }

    @Override
    public Category getCategoryWithLessProducts() {
        // TODO Auto-generated method stub
        return null;
    }
}
