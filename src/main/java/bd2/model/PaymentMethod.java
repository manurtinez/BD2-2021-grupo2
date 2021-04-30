package bd2.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class PaymentMethod {
    /**
     * Clave primaria del objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
