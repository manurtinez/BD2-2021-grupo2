package bd2.repositories.spring;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import bd2.model.DeliveryMethod;

public interface DeliveryMethodRepository extends CrudRepository<DeliveryMethod, UUID> {

}
