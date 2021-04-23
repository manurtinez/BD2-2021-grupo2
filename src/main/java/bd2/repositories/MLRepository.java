package bd2.repositories;

import bd2.model.Category;
import bd2.model.Provider;
import bd2.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

@Repository
public class MLRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public MLRepository() {
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    public Category saveCategory(Category category) {
    	getSession().save(category);
    	return category;
    }

    public Provider saveProvider(Provider provider) {
        getSession().save(provider);
        return provider;
    }

    public Category getCategoryByName(String name) {
        return (Category) getSession().createQuery("FROM Category WHERE name = :name").setParameter("name", name).getSingleResult();
    }

    public User saveUser(User user) throws MLException {
        try {
            getSession().save(user);
            getSession().flush();
            return user;
        } catch (PersistenceException e) {
            throw new MLException("Constraint Violation");
        }
    }

    public User getUserByEmail(String email) {
        try {
            return (User) getSession().createQuery("FROM User WHERE email = :email").setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public Provider getProviderByCuit(Long cuit) {
        try {
            return (Provider) getSession().createQuery("FROM Provider WHERE cuit = :cuit").setParameter("cuit", cuit).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
