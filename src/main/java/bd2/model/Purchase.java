package bd2.model;

import java.util.Date;
import java.util.UUID;

import bd2.model.DeliveryMethod;
import bd2.model.PaymentMethod;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "purchaseindex")
public class Purchase {

  @Id
  private UUID id;

  private ProductOnSale productOnSale;

  private int quantity;

  private User client;

  private DeliveryMethod deliveryMethod;

  private PaymentMethod paymentMethod;

  private String address;

  private Float coordX;

  private Float coordY;

  private Date dateOfPurchase;

  public Purchase() {
  }

  public Purchase(ProductOnSale productOnSale, int quantity, User client, DeliveryMethod deliveryMethod,
      PaymentMethod paymentMethod, String address, Float coordX, Float coordY, Date dateOfPurchase) {
    this.productOnSale = productOnSale;
    this.quantity = quantity;
    this.client = client;
    this.deliveryMethod = deliveryMethod;
    this.paymentMethod = paymentMethod;
    this.address = address;
    this.coordX = coordX;
    this.coordY = coordY;
    this.dateOfPurchase = dateOfPurchase;
  }

  // Getters and setters

  public UUID getId() {
    return this.id;
  }

  public ProductOnSale getProductOnSale() {
    return this.productOnSale;
  }

  public void setProductOnSale(ProductOnSale productOnSale) {
    this.productOnSale = productOnSale;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public User getClient() {
    return this.client;
  }

  public void setClient(User client) {
    this.client = client;
  }

  public DeliveryMethod getDeliveryMethod() {
    return this.deliveryMethod;
  }

  public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public PaymentMethod getPaymentMethod() {
    return this.paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Float getCoordX() {
    return this.coordX;
  }

  public void setCoordX(Float coordX) {
    this.coordX = coordX;
  }

  public Float getCoordY() {
    return this.coordY;
  }

  public void setCoordY(Float coordY) {
    this.coordY = coordY;
  }

  public Date getDateOfPurchase() {
    return this.dateOfPurchase;
  }

  public void setDateOfPurchase(Date dateOfPurchase) {
    this.dateOfPurchase = dateOfPurchase;
  }

  // Fin getters and setters

  /**
   * Retorna el monto total a pagar, es decir: Cantidad de productos, por precio
   * por producto, mas precio de envío
   * 
   * @return monto total
   */
  public Float getAmount() {
    return (this.quantity * this.productOnSale.getPrice()) + this.deliveryMethod.getCost();
  }

}
