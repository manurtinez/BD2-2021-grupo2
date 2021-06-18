package bd2.repositories.spring;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import bd2.model.Purchase;
import bd2.model.User;

public interface UserRepository extends CrudRepository<User, UUID> {

  User findByEmail(String email);

  @Query("SELECT ps FROM Purchase ps WHERE ps.client.email = :username")
  List<Purchase> getAllPurchasesMadeByUser(@Param("username") String username);

}
