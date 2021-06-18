package bd2.repositories.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import bd2.model.ProductOnSale;
import bd2.model.Product;
import bd2.model.Provider;

import java.util.Date;

public interface ProductOnSaleRepository extends CrudRepository<ProductOnSale, Long> {
	
	@Query("SELECT pos FROM ProductOnSale pos " + "WHERE pos.product = ?2 "
            + "and pos.provider = ?3 " + "and pos.initialDate >= ?4")
	public Page<ProductOnSale> hasNewerProductOnSaleVersion(Pageable pageable, Product product, Provider provider, Date initialDate);

}
