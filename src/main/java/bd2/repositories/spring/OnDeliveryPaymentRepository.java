package bd2.repositories.spring;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import bd2.model.OnDeliveryPayment;

public interface OnDeliveryPaymentRepository extends CrudRepository<OnDeliveryPayment, UUID> {

	public OnDeliveryPayment findByName(String name);
	
}
