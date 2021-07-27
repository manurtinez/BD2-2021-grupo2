package bd2.model;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Clase que representa un pago a contraentrega.
 */

@Document(indexName = "ondeliverypaymentindex")
public class OnDeliveryPayment extends PaymentMethod {

    private Float promisedAmount;

    /**
     * Constructor vacío necesario
     */
    public OnDeliveryPayment() {
    }

    /**
     * Constructor para la clase Categoria
     *
     * @param name El nombre de la categoria
     */

    public OnDeliveryPayment(String name, Float promisedAmount) {
        super(name);
        this.promisedAmount = promisedAmount;
    }

    public Float getPromisedAmount() {
        return promisedAmount;
    }

    public void setPromisedAmount(Float promisedAmount) {
        this.promisedAmount = promisedAmount;
    }
}
