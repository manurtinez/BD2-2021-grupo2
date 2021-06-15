package bd2.repositories.spring;

import org.springframework.data.repository.CrudRepository;

import bd2.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
  public Product findByName(String name);
}
