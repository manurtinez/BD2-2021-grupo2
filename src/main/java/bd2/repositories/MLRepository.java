package bd2.repositories;
import bd2.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

    public Category getCategoryByName(String name) {
        return (Category) getSession().createQuery("from Category WHERE name = :name").setParameter("name", name).getSingleResult();
    }
}
