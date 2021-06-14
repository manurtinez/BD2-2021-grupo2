package bd2.config;

import bd2.services.MLService;
import bd2.services.SpringDataMLService;
import bd2.utils.DBInitializer;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "ar.edu.unlp.info.bd2.repositories")
@EnableTransactionManagement
public class SpringDataConfiguration {

  @Bean
  public MLService springDataJpaService() {
    return new SpringDataMLService();
  }

  @Bean
  public DBInitializer createDBInitializer() {
    return new DBInitializer();
  }

  @Bean
  public DataSource dataSource() {
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl(
        "jdbc:mysql://localhost:3306/grupo" + this.getGroupNumber() + "?allowPublicKeyRetrieval=true&useSSL=false");
    dataSource.setUsername("grupo2");
    dataSource.setPassword("123");

    return dataSource;
  }

  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    em.setDataSource(dataSource());
    em.setPackagesToScan(new String[] { "ar.edu.unlp.info.bd2.model" });

    JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    em.setJpaVendorAdapter(vendorAdapter);
    em.setJpaProperties(hibernateProperties());

    return em;
  }

  @Bean
  public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory emf) {
    JpaTransactionManager transactionManager = new JpaTransactionManager();
    transactionManager.setEntityManagerFactory(emf);

    return transactionManager;
  }

  private final Properties hibernateProperties() {
    Properties hibernateProperties = new Properties();

    hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create");
    hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
    hibernateProperties.setProperty("hibernate.show_sql", "true");
    hibernateProperties.setProperty("hibernate.format_sql", "true");
    hibernateProperties.setProperty("hibernate.use_sql_comments", "false");

    return hibernateProperties;
  }

  private Integer getGroupNumber() {
    return 2;
  }
}
