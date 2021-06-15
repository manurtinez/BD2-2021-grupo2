package bd2.repositories.spring;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import bd2.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

  public Category findByName(String name);

  @Query("SELECT c FROM Category c " + "JOIN c.products prods " + "GROUP BY c " + "ORDER BY count(*)")
  public Category getCategoryWithLessProducts(Pageable pageable);
}
