package bd2.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Clase que representa el historial de cambios de precio para un determinado
 * producto
 */
@Entity
@Table(name = "product_provider")
@AssociationOverrides({
        @AssociationOverride(name = "product", joinColumns = @JoinColumn(name = "PRODUCT_ID")),
        @AssociationOverride(name = "provider", joinColumns = @JoinColumn(name = "PROVIDER_ID"))
})
public class ProductProvider {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  /**
   * Id de producto correspondiente
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("productId")
  @JoinColumn(name = "PRODUCT_ID")
  private Product product;

  /**
   * Id de proveedor correspondiente
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("providerId")
  @JoinColumn(name = "PROVIDER_ID")
  private Provider provider;

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
  public ProductProvider() {
  }

  /**
   * Constructor
   * 
   * @param product El producto correspondiente
   * @param price   Precio para el producto
   * @param date    Fecha para llevar el historial
   */
  public ProductProvider(Product product, long price, Date date) {
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
