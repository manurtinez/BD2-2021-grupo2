package bd2.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que representa el historial de cambios de precio para un determinado
 * producto
 */
@Entity
@Table(name = "product_price")
public class ProductPrice {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  /**
   * Id de producto correspondiente
   */
  @ManyToOne(fetch = FetchType.LAZY)
  private Product product;

  /**
   * Precio actual del producto
   */
  private long price;

  /**
   * Fecha de cambio / creación del precio
   */
  private Date date;

  /**
   * Constructor vacio
   */
  public ProductPrice() {
  }

  /**
   * Constructor
   * 
   * @param product El producto correspondiente
   * @param price   Precio para el producto
   * @param date    Fecha para llevar el historial
   */
  public ProductPrice(Product product, long price, Date date) {
    this.product = product;
    this.price = price;
    this.date = date;
  }

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public long getPrice() {
    return this.price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

}
