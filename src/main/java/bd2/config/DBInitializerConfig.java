package bd2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bd2.utils.DBInitializer;

@Configuration
public class DBInitializerConfig {

    @Bean
    public DBInitializer createDBInitializer() {
        return new DBInitializer();
    }

}
