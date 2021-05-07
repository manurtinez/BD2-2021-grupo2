package bd2.repositories;

import bd2.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.NoResultException;
// import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

@Repository
@SuppressWarnings("unchecked")
@Transactional
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
        getSession().flush();
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

    public List<Purchase> getAllPurchasesMadeByUser(String username) {
        try {
            return (List<Purchase>) getSession()
                    .createQuery("SELECT ps FROM Purchase ps WHERE ps.client.email = :username")
                    .setParameter("username", username).getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<User> getUsersSpendingMoreThanInPurchase(Float amount) {
        try {
            return getSession()
                    .createQuery("SELECT p.client FROM Purchase p " + "JOIN p.client as cl "
                            + "JOIN p.productOnSale as pos " + "JOIN p.deliveryMethod as dm "
                            + "WHERE (p.quantity * pos.price + dm.cost) > :amount")
                    .setParameter("amount", amount).getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<User> getUsersSpendingMoreThan(Float amount) {
        try {
            return getSession()
                    .createQuery("SELECT p.client FROM Purchase p " + "JOIN p.client as cl "
                            + "JOIN p.productOnSale as pos " + "JOIN p.deliveryMethod as dm " + "GROUP BY p.client "
                            + "HAVING SUM(p.quantity * pos.price + dm.cost) > CAST(:amount as double)")
                    .setParameter("amount", amount).getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }
}
