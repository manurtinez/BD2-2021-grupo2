package bd2.services;

import bd2.model.*;
import bd2.repositories.MLException;
import bd2.repositories.MLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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
        return this.repository.saveCategory(c);
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
        User user = new User(email, fullname, password, dayOfBirth);
        return this.repository.saveUser(user);
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
        return this.repository.saveProvider(prov);
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
    public Optional<Provider> getProviderByCuit(long cuit) {
    	return Optional.of(this.repository.getProviderByCuit(cuit));
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
