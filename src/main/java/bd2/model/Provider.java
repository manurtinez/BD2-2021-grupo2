package bd2.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Clase que representa un proveedor de productos
 */
@Entity(name = "Provider")
@Table(name = "provider")
public class Provider {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private String name;

  @OneToMany(fetch = FetchType.LAZY,mappedBy = "provider")
  private Set<ProductProvider> providers = new HashSet<ProductProvider>();

  private String cuit;

  /**
   * Constructor vacio
   */
  public Provider() {
  }

  /**
   * Constructor
   * 
   * @param name     Nombre de proveedor
//   * @param products Lista de productos del proveedor
   * @param cuit     CUIT del proveedor
   */
  public Provider(String name, String cuit) {
    this.name = name;
//    this.products = new ArrayList<Product>();
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

//    this.products.add(p);
  }

  public void changeProductPrice(Product p, long newPrice) {
    // TODO
    // aca se cambiaria el precio de un producto en especifico, agregando un
    // nuevo ProductPrice?
    // int index = this.products.indexOf(p);

  }

  public String getCuit() {
    return this.cuit;
  }

  public void setCuit(String cuit) {
    this.cuit = cuit;
  }

}
