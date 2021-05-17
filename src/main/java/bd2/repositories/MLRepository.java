package bd2.repositories;

import bd2.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    public Object update(Object object) {
        getSession().update(object);
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

    public Category getCategoryByName(String name) {
        return (Category) getSession().createQuery("FROM Category WHERE name = :name").setParameter("name", name)
                .getSingleResult();
    }

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

    public List<Provider> getTopNProvidersInPurchases(int n) {
        try {
            return getSession()
                    .createQuery("SELECT p FROM Purchase pur " + "JOIN pur.productOnSale as pos "
                            + "JOIN pos.provider as p " + "GROUP BY p.id " + "ORDER BY SUM(pur.quantity) DESC")
                    .setFirstResult(0).setMaxResults(3).getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Product> getTop3MoreExpensiveProducts() {
        try {
            return getSession().createQuery(
                    "SELECT prod FROM ProductOnSale as pos " + "JOIN pos.product as prod " + "ORDER BY pos.price DESC")
                    .setMaxResults(3).getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<User> getTopNUsersMorePurchase(int n) {
        try {
            return getSession().createQuery(
                    "SELECT cli FROM Purchase as pur " + "JOIN pur.client as cli " + "ORDER BY cli.purchases.size DESC")
                    .setMaxResults(n).getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public Optional<ProductOnSale> getLastProductOnSaleVersion(Product product, Provider provider) {
        return getSession()
                .createQuery("SELECT pos FROM ProductOnSale pos " + "WHERE pos.product = :product "
                        + "and pos.provider = :provider " + "and pos.finalDate IS NULL")
                .setParameter("product", product).setParameter("provider", provider).setMaxResults(1).getResultList()
                .stream().findFirst();
    }

    public boolean hasNewerProductOnSaleVersion(Product product, Provider provider, Date initialDate) {
        try {
            getSession()
                    .createQuery("SELECT pos FROM ProductOnSale pos " + "WHERE pos.product = :product "
                            + "and pos.provider = :provider " + "and pos.initialDate >= :initialDate")
                    .setParameter("product", product).setParameter("provider", provider)
                    .setParameter("initialDate", initialDate).getSingleResult();
            return true;
        } catch (NoResultException e) {
            return false;
        }
    }

    public List<Purchase> getPurchasesInPeriod(Date startDate, Date endDate) {
        return (List<Purchase>) getSession()
                .createQuery("SELECT p FROM Purchase p WHERE p.dateOfPurchase BETWEEN :startDate and :endDate")
                .setParameter("startDate", startDate).setParameter("endDate", endDate).getResultList();
    }

    public List<Product> getProductForCategory(Category category) {
        return (List<Product>) getSession().createQuery("SELECT p FROM Product p WHERE p.category = :category")
                .setParameter("category", category).getResultList();
    }

    public Product getBestSellingProduct() {
        try {
            return (Product) getSession()
                    .createQuery("SELECT prod FROM Purchase pur JOIN pur.productOnSale as pos JOIN pos.product as prod "
                            + "GROUP BY prod.id ORDER BY count(*) DESC")
                    .setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Product> getProductsOnePrice() {
        try {
            return getSession().createQuery("SELECT prod FROM ProductOnSale as pos JOIN pos.product as prod "
                    + "WHERE NOT EXISTS "
                    + "(SELECT pd FROM ProductOnSale as ps JOIN ps.product as pd WHERE ps.product.id = pos.product.id AND ps.price <> pos.price)")
                    .getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Provider> getProvidersDoNotSellOn(Date day) {
        try {
            return getSession().createQuery("SELECT prov FROM Provider as prov " + "WHERE prov NOT IN "
                    + "(SELECT pro FROM Purchase pur JOIN pur.productOnSale as pos JOIN pos.provider as pro "
                    + "WHERE pur.dateOfPurchase = :day)").setParameter("day", day).getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Product> getProductsNotSold() {
        try {
            return getSession()
                    .createQuery("SELECT prod FROM Product as prod " + "WHERE prod.id NOT IN "
                            + "(SELECT pr.id FROM Purchase as pur JOIN pur.productOnSale as ps JOIN ps.product as pr)")
                    .getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public Product getHeaviestProduct() {
        try {
            return (Product) getSession().createQuery("FROM Product prod ORDER BY weight DESC").setMaxResults(1)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Purchase> getPurchasesForProvider(Long cuit) {
        return (List<Purchase>) getSession()
                .createQuery("SELECT pur FROM Purchase pur WHERE pur.productOnSale.provider.cuit = :cuit")
                .setParameter("cuit", cuit).getResultList();
    }

    public Provider getProviderLessExpensiveProduct() {
        try {
            return (Provider) getSession().createQuery("SELECT prov " + "FROM ProductOnSale pos "
                    + "JOIN pos.provider as prov " + "WHERE pos.finalDate IS NULL " + "ORDER BY pos.price")
                    .setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public OnDeliveryPayment getMoreChangeOnDeliveryMethod() {
        try {
            return (OnDeliveryPayment) getSession().createQuery(
                    "SELECT pm FROM Purchase pur " + "JOIN pur.paymentMethod pm " + "JOIN pur.productOnSale pos "
                            + "WHERE TYPE(pm) = OnDeliveryPayment " + "ORDER BY (pm.promisedAmount - pos.price) DESC")
                    .setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public DeliveryMethod getMostUsedDeliveryMethod() {
        try {
            return (DeliveryMethod) getSession().createQuery("SELECT dm FROM Purchase pur "
                    + "JOIN pur.deliveryMethod dm " + "GROUP BY dm " + "ORDER BY count(*) DESC").setMaxResults(1)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public Category getCategoryWithLessProducts() {
        try {
            return (Category) getSession().createQuery(
                    "SELECT c FROM Category c " + "JOIN c.products prods " + "GROUP BY c " + "ORDER BY count(*)")
                    .setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<ProductOnSale> getSoldProductsOn(Date day) {
        try {
            List<ProductOnSale> results = getSession()
                    .createQuery("SELECT DISTINCT pos FROM Purchase pur " + "JOIN pur.productOnSale pos "
                            + "JOIN FETCH pos.product prod " + "WHERE pur.dateOfPurchase = :day ")
                    .setParameter("day", day).getResultList();
            return results;
        } catch (NoResultException e) {
            return null;
        }
    }
}
