package bd2.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase que representa un proveedor de productos
 */
@Entity(name = "Provider")
@Table(name = "provider")
public class Provider {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider")
  private Set<ProductOnSale> productsOnSale = new HashSet<ProductOnSale>();

  private Long cuit;

  /**
   * Constructor vacio
   */
  public Provider() {
  }

  /**
   * Constructor
   * 
   * @param name Nombre de proveedor // * @param products Lista de productos del
   *             proveedor
   * @param cuit CUIT del proveedor
   */
  public Provider(String name, Long cuit) {
    this.name = name;
    // this.products = new ArrayList<Product>();
    this.cuit = cuit;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addProduct(Product p) {
    // Aca iría la lógica para crear un ProductPrice con el precio y fecha del
    // producto

    // this.products.add(p);
  }

  public void changeProductPrice(Product p, long newPrice) {
    // TODO
    // aca se cambiaria el precio de un producto en especifico, agregando un
    // nuevo ProductPrice?
    // int index = this.products.indexOf(p);

  }

  public Long getCuit() {
    return this.cuit;
  }

  public void setCuit(Long cuit) {
    this.cuit = cuit;
  }

  public Long getId() {
    return id;
  }

}
