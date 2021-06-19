package bd2.repositories.spring;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import bd2.model.Product;
import bd2.model.ProductOnSale;
import bd2.model.Provider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import bd2.model.Purchase;
import org.springframework.data.repository.query.Param;

public interface PurchaseRepository extends CrudRepository<Purchase, UUID> {

    @Query("SELECT p FROM Purchase p WHERE p.dateOfPurchase BETWEEN :startDate and :endDate")
    public List<Purchase> getPurchasesInPeriod(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("SELECT pur FROM Purchase pur WHERE pur.productOnSale.provider.cuit = :cuit")
    public List<Purchase> getPurchasesForProvider(@Param("cuit") Long cuit);
}
