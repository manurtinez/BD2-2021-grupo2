package bd2.services;

import bd2.model.*;
import bd2.repositories.MLException;
import bd2.repositories.MLRepository;

import java.util.Date;
import java.util.Optional;

public class MLServiceImpl implements MLService {

    /**
     * Constructor
     * 
     * @param repository El repositorio para (??) algo
     */
    public MLServiceImpl(MLRepository repository) {

    }

    @Override
    public Category createCategory(String name) throws MLException {
        return new Category(name);
    }

    @Override
    public Product createProduct(String name, Float weight, Category category) throws MLException {
        return null;
    }

    @Override
    public User createUser(String email, String fullname, String password, Date dayOfBirth) throws MLException {
        return null;
    }

    @Override
    public Provider createProvider(String name, Long cuit) throws MLException {
        return null;
    }

    @Override
    public DeliveryMethod createDeliveryMethod(String name, Float cost, Float startWeight, Float endWeight)
            throws MLException {
        return null;
    }

    @Override
    public CreditCardPayment createCreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv,
            String owner) throws MLException {
        return null;
    }

    @Override
    public OnDeliveryPayment createOnDeliveryPayment(String name, Float promisedAmount) throws MLException {
        return null;
    }

    @Override
    public ProductOnSale createProductOnSale(Product product, Provider provider, Float price, Date initialDate)
            throws MLException {
        return null;
    }

    @Override
    public Purchase createPurchase(ProductOnSale productOnSale, Integer quantity, User client,
            DeliveryMethod deliveryMethod, PaymentMethod paymentMethod, String address, Float coordX, Float coordY,
            Date dateOfPurchase) throws MLException {
        return null;
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<Provider> getProviderByCuit(long cuit) {
        return Optional.empty();
    }

    @Override
    public Optional<Category> getCategoryByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> getProductByName(String name) {
        return Optional.empty();
    }

    @Override
    public ProductOnSale getProductOnSaleById(Long id) {
        return null;
    }

    @Override
    public Optional<DeliveryMethod> getDeliveryMethodByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<CreditCardPayment> getCreditCardPaymentByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<OnDeliveryPayment> getOnDeliveryPaymentByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Purchase> getPurchaseById(Long id) {
        return Optional.empty();
    }
}
