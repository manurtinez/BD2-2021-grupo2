package bd2.model.PKs;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class ProductProviderPK implements Serializable {
    @Column(name = "PRODUCT_ID")
    private UUID productId;
    @Column(name = "PROVIDER_ID")
    private UUID providerId;

}
