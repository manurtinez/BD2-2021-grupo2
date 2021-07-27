package bd2.model;

import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * Clase que representa un pago con tarjeta de crédito
 */

@Document(indexName = "creditcardpaymentindex")
public class CreditCardPayment extends PaymentMethod {

    private String brand;
    private Long number;
    private Date expiry;
    private Integer cvv;
    private String owner;

    /**
     * Constructor vacío necesario
     */
    public CreditCardPayment() {
    }

    /**
     * Constructor para la clase CreditCardPayment
     *
     * @param name El nombre del CreditCardPayment
     */

    public CreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv, String owner) {
        super(name);
        this.brand = brand;
        this.number = number;
        this.expiry = expiry;
        this.cvv = cvv;
        this.owner = owner;
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
