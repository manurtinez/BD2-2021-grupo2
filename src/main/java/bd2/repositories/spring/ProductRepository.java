package bd2.repositories.spring;

import bd2.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import bd2.model.Product;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
  public Product findByName(String name);

  @Query("SELECT prod FROM Purchase pur JOIN pur.productOnSale as pos JOIN pos.product as prod "
      + "GROUP BY prod.id ORDER BY count(*) DESC")
  public Page<Product> getBestSellingProduct(Pageable pageable);

  public Product findTop1ByOrderByWeightDesc();

  @Query("SELECT prod FROM ProductOnSale as pos " + "JOIN pos.product as prod " + "ORDER BY pos.price DESC")
  public List<Product> getTop3MoreExpensiveProducts(Pageable of);

  @Query("SELECT p FROM Product p WHERE p.category = :category")
  public List<Product> getProductForCategory(@Param("category") Category category);

  @Query("SELECT prod FROM ProductOnSale as pos JOIN pos.product as prod "
          + "WHERE NOT EXISTS "
          + "(SELECT pd FROM ProductOnSale as ps JOIN ps.product as pd WHERE ps.product.id = pos.product.id AND ps.price <> pos.price)")
  public List<Product> getProductsOnePrice();
  
  @Query("SELECT prod FROM Product as prod " + "WHERE prod.id NOT IN "
          + "(SELECT pr.id FROM Purchase as pur JOIN pur.productOnSale as ps JOIN ps.product as pr)")
  public List<Product> getProductsNotSold();
}
