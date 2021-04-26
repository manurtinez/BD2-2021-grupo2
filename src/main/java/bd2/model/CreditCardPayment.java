package bd2.model;

import javax.persistence.*;
import java.util.UUID;
import java.util.Date;

/**
 * Clase que representa un pago con tarjeta de crédito
 */

@Entity(name = "CreditCardPayment")
@Table(name = "credit_card_payment")
public class CreditCardPayment {

    /**
     * Clave primaria del objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private String brand;
    private Long number;
    private Date expiry;
    private Integer cvv;
    private String owner;

    /**
     * Constructor vacio necesario
     */
    public CreditCardPayment() {
    }

    /**
     * Constructor para la clase CreditCardPayment
     *
     * @param name El nombre del CreditCardPayment
     */

    public CreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv, String owner) {
        this.name = name;
        this.brand = brand;
        this.number = number;
        this.expiry = expiry;
        this.cvv = cvv;
        this.owner = owner;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
