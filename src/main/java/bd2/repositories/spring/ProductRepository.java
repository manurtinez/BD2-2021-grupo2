package bd2.repositories.spring;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import bd2.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
  public Product findByName(String name);

  @Query("SELECT prod FROM Purchase pur JOIN pur.productOnSale as pos JOIN pos.product as prod "
      + "GROUP BY prod.id ORDER BY count(*) DESC")
  public Page<Product> getBestSellingProduct(Pageable pageable);
}
