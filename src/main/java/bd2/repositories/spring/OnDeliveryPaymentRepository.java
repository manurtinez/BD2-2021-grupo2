package bd2.repositories.spring;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import bd2.model.OnDeliveryPayment;

public interface OnDeliveryPaymentRepository extends CrudRepository<OnDeliveryPayment, UUID> {

	public OnDeliveryPayment findByName(String name);

	@Query("SELECT pur.paymentMethod FROM Purchase pur " + "WHERE TYPE(pur.paymentMethod.class) = OnDeliveryPayment "
			+ "ORDER BY (pur.paymentMethod.promisedAmount - (pur.productOnSale.price * pur.quantity) - pur.deliveryMethod.cost ) DESC")
	public Page<OnDeliveryPayment> getMoreChangeOnDeliveryMethod(PageRequest of);

}
