package bd2.repositories.spring;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import bd2.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, UUID> {

}
