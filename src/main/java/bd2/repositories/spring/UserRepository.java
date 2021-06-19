package bd2.repositories.spring;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import bd2.model.Purchase;
import bd2.model.User;

public interface UserRepository extends CrudRepository<User, UUID> {

  User findByEmail(String email);

  @Query("SELECT ps FROM Purchase ps WHERE ps.client.email = :username")
  List<Purchase> getAllPurchasesMadeByUser(@Param("username") String username);

  @Query("SELECT p.client FROM Purchase p " + "JOIN p.client as cl " + "JOIN p.productOnSale as pos "
      + "JOIN p.deliveryMethod as dm " + "WHERE (p.quantity * pos.price + dm.cost) > :amount")
  List<User> getUsersSpendingMoreThanInPurchase(@Param("amount") Float amount);

  @Query("SELECT p.client FROM Purchase p " + "JOIN p.client as cl " + "JOIN p.productOnSale as pos "
      + "JOIN p.deliveryMethod as dm " + "GROUP BY p.client "
      + "HAVING SUM(p.quantity * pos.price + dm.cost) > CAST(:amount as double)")
  List<User> getUsersSpendingMoreThan(@Param("amount") Float amount);

  @Query("SELECT cli FROM Purchase as pur " + "JOIN pur.client as cli " + "ORDER BY cli.purchases.size DESC")
  List<User> getTopNUsersMorePurchase(Pageable of);

}
