package bd2.repositories.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import bd2.model.ProductOnSale;
import bd2.model.Product;
import bd2.model.Provider;

import java.util.Date;

public interface ProductOnSaleRepository extends CrudRepository<ProductOnSale, Long> {

	@Query("SELECT pos FROM ProductOnSale pos " + "WHERE pos.product = :product " + "and pos.provider = :provider "
			+ "and pos.initialDate >= :initialDate")
	public Page<ProductOnSale> hasNewerProductOnSaleVersion(Pageable pageable, @Param("product") Product product,
			@Param("provider") Provider provider, @Param("initialDate") Date initialDate);

	@Query("SELECT pos FROM ProductOnSale pos " + "WHERE pos.product = :product " + "and pos.provider = :provider "
			+ "and pos.finalDate IS NULL")
	public Page<ProductOnSale> getLastProductOnSaleVersion(Pageable pageable, @Param("product") Product product,
			@Param("provider") Provider provider);

}
