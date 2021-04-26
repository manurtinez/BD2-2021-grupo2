package bd2.repositories;

import bd2.model.Category;
import bd2.model.Provider;
import bd2.model.User;
import bd2.model.Product;
import bd2.model.DeliveryMethod;
import bd2.model.CreditCardPayment;
import bd2.model.OnDeliveryPayment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
// import javax.persistence.PersistenceException;

@Repository
public class MLRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public MLRepository() {
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public Object save(Object object) {
        getSession().persist(object);
        return object;
    }

    public Product getProductByName(String name) {
        try {
            return (Product) getSession().createQuery("FROM Product WHERE name = :name").setParameter("name", name)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    // public Category saveCategory(Category category) {
    // return (Category) getSession().save(category);
    // }

    // public Provider saveProvider(Provider provider) {
    // getSession().save(provider);
    // return provider;
    // }

    public Category getCategoryByName(String name) {
        return (Category) getSession().createQuery("FROM Category WHERE name = :name").setParameter("name", name)
                .getSingleResult();
    }

    // public User saveUser(User user) throws MLException {
    // try {
    // getSession().save(user);
    // getSession().flush();
    // return user;
    // } catch (PersistenceException e) {
    // throw new MLException("Constraint Violation");
    // }
    // }

    public User getUserByEmail(String email) {
        try {
            return (User) getSession().createQuery("FROM User WHERE email = :email").setParameter("email", email)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public Provider getProviderByCuit(Long cuit) {
        try {
            return (Provider) getSession().createQuery("FROM Provider WHERE cuit = :cuit").setParameter("cuit", cuit)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public DeliveryMethod getDeliveryMethodByName(String name) {
        try {
            return (DeliveryMethod) getSession().createQuery("FROM DeliveryMethod WHERE name = :name")
                    .setParameter("name", name).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public CreditCardPayment getCreditCardPaymentByName(String name) {
        try {
            return (CreditCardPayment) getSession().createQuery("FROM CreditCardPayment WHERE name = :name")
                    .setParameter("name", name).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public OnDeliveryPayment getOnDeliveryPaymentByName(String name) {
        try {
            return (OnDeliveryPayment) getSession().createQuery("FROM OnDeliveryPayment WHERE name = :name")
                    .setParameter("name", name).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
