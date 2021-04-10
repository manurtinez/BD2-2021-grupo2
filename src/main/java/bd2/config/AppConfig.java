package bd2.config;

import bd2.repositories.MLRepository;
import bd2.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MLService createService() {
        MLRepository repository = this.createRepository();
        return new MLServiceImpl(repository);
    }

    @Bean
    public MLRepository createRepository() {
        return new MLRepository();
    }
}
