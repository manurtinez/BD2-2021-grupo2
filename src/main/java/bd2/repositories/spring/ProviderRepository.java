package bd2.repositories.spring;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import bd2.model.Provider;

public interface ProviderRepository extends CrudRepository<Provider, Long> {

	public Provider findByCuit(long cuit);

	@Query("SELECT prov FROM Provider as prov " + "WHERE prov NOT IN "
			+ "(SELECT pro FROM Purchase pur JOIN pur.productOnSale as pos JOIN pos.provider as pro "
			+ "WHERE pur.dateOfPurchase = :day)")
	public List<Provider> getProvidersDoNotSellOn(@Param("day") Date day);

	@Query("SELECT prov " + "FROM ProductOnSale pos " + "JOIN pos.provider as prov " + "WHERE pos.finalDate IS NULL "
			+ "ORDER BY pos.price")
	public Page<Provider> getProviderLessExpensiveProduct(Pageable pageable);

}
