package bd2.repositories;
import bd2.model.*;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MLRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public MLRepository() {
    }
    
    public void save(Category category) {
    	sessionFactory.getCurrentSession().save(category);
    	sessionFactory.getCurrentSession().flush();
    }
}
