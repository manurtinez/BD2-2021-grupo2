package bd2.repositories.spring;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import bd2.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, UUID> {

    @Query("SELECT p FROM Purchase p WHERE p.dateOfPurchase BETWEEN :startDate and :endDate")
    public List<Purchase> getPurchasesInPeriod(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("SELECT pur FROM Purchase pur WHERE pur.productOnSale.provider.cuit = :cuit")
    public List<Purchase> getPurchasesForProvider(@Param("cuit") Long cuit);
}
