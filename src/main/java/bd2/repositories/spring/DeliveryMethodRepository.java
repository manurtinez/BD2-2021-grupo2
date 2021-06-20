package bd2.repositories.spring;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import bd2.model.DeliveryMethod;

public interface DeliveryMethodRepository extends CrudRepository<DeliveryMethod, UUID> {

  //@Query("FROM DeliveryMethod WHERE name = :name LIMIT 1")
  //Optional<DeliveryMethod> findBbyName(@Param("name") String name);
  
  Optional<DeliveryMethod> findFirstByName(String name);

  @Query("SELECT dm FROM Purchase pur " + "JOIN pur.deliveryMethod dm " + "GROUP BY dm " + "ORDER BY count(*) DESC")
  Page<DeliveryMethod> getMostUsedDeliveryMethod(PageRequest of);

}
