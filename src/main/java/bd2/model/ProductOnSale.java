package bd2.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Clase que representa el historial de cambios de precio para un determinado
 * producto
 */
@Entity
@Table(name = "product_on_sale")
@AssociationOverrides({ @AssociationOverride(name = "product", joinColumns = @JoinColumn(name = "PRODUCT_ID")),
    @AssociationOverride(name = "provider", joinColumns = @JoinColumn(name = "PROVIDER_ID")) })
public class ProductOnSale {

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
  private float price;

  /**
   * Fecha de cambio / creación del precio
   */
  private Date initialDate;

  /**
   * Fecha de fin del precio. Inicia en null
   */
  private Date finalDate = null;

  /**
   * Constructor vacio
   */
  public ProductOnSale() {
  }

  /**
   * Constructor
   * 
   * @param product El producto correspondiente
   * @param price   Precio para el producto
   * @param date    Fecha para llevar el historial
   */
  public ProductOnSale(Product product, Provider provider, float price, Date initialDate) {
    this.product = product;
    this.provider = provider;
    this.price = price;
    this.initialDate = initialDate;
  }

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public float getPrice() {
    return this.price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public Date getInitialDate() {
    return this.initialDate;
  }

  public void setInitialDate(Date initialDate) {
    this.initialDate = initialDate;
  }

  public Provider getProvider() {
    return this.provider;
  }

  public void setProvider(Provider provider) {
    this.provider = provider;
  }

  public long getId() {
    return this.id;
  }

  public Date getFinalDate() {
    return this.finalDate;
  }

  public void setFinalDate(Date finalDate) {
    this.finalDate = finalDate;
  }

}
