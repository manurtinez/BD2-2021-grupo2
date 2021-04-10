package bd2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

  @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL)
  private List<Product> products;

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
   * @param products Lista de productos del proveedor
   * @param cuit     CUIT del proveedor
   */
  public Provider(String name, String cuit) {
    this.name = name;
    this.products = new ArrayList<Product>();
    this.cuit = cuit;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Product> getProducts() {
    return this.products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public void addProduct(Product p) {
    // Aca iría la lógica para crear un ProductPrice con el precio y fecha del
    // producto

    this.products.add(p);
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
