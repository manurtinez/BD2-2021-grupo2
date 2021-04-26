package bd2.model;

import javax.persistence.*;
import java.util.UUID;

/**
 * Clase que representa un pago a contraentrega.
 */

@Entity(name = "OnDeliveryPayment")
@Table(name = "on_delivery_payment")
public class OnDeliveryPayment {

    /**
     * Clave primaria del objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private Float promisedAmount;

    /**
     * Constructor vacio necesario
     */
    public OnDeliveryPayment() {
    }

    /**
     * Constructor para la clase Categoria
     *
     * @param name El nombre de la categoria
     */

    public OnDeliveryPayment(String name, Float promisedAmount) {
        this.name = name;
        this.promisedAmount = promisedAmount;
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

    public Float getPromisedAmount() {
        return promisedAmount;
    }

    public void setPromisedAmount(Float promisedAmount) {
        this.promisedAmount = promisedAmount;
    }
}
