package bd2.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "paymentmethodindex")
public class PaymentMethod {
    /**
     * Clave primaria del objeto
     */
    @Id
    private UUID id;

    /**
     * Nombre del método de pago
     */
    private String name;

    /**
     * Constructor vacío
     */
    public PaymentMethod() {
    }

    /**
     * Constructor de super clase
     * 
     * @param id
     * @param name
     */
    public PaymentMethod(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
