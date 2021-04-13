package bd2.repositories;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MLRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public MLRepository() {
    }
}
