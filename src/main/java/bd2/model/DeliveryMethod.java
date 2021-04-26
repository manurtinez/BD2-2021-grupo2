package bd2.model;

import javax.persistence.*;
import java.util.UUID;

/**
 * Clase que representa un Método de envio.
 */

@Entity(name = "DeliveryMethod")
@Table(name = "delivery_method")
public class DeliveryMethod {

    /**
     * Clave primaria del objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private Float cost;
    private Float startWeight;
    private Float endWeight;

    /**
     * Constructor vacio necesario
     */
    public DeliveryMethod() {
    }

    /**
     * Constructor para la clase DeliveryMethod
     *
     * @param name El nombre del DeliveryMethod
     */
    public DeliveryMethod(String name, float cost, float startWeight, float endWeight) {
        this.setName(name);
        this.setCost(Float.valueOf(cost));
        this.setStartWeight(Float.valueOf(startWeight));
        this.setEndWeight(Float.valueOf(endWeight));
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCost() {
        return this.cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Float getStartWeight() {
        return this.startWeight;
    }

    public void setStartWeight(Float startWeight) {
        this.startWeight = startWeight;
    }

    public Float getEndWeight() {
        return this.endWeight;
    }

    public void setEndWeight(Float endWeight) {
        this.endWeight = endWeight;
    }

}
