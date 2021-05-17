package bd2.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase que representa un producto
 */
@Entity(name = "Product")
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Float weight;

  @ManyToOne(fetch = FetchType.LAZY)
  private Category category;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL)
  private Set<ProductOnSale> productsOnSale = new HashSet<ProductOnSale>();

  /**
   * Constructor vacío necesario
   */
  public Product() {
  }

  /**
   * Constructor real
   * 
   * @param name     Nombre de producto
   * @param weight   Peso de producto
   * @param category Categoria de producto
   */
  public Product(String name, float weight, Category category) {
    this.name = name;
    this.weight = weight;
    this.category = category;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Float getWeight() {
    return this.weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public Category getCategory() {
    return this.category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public void addProductOnSale(ProductOnSale pos) {
    this.productsOnSale.add(pos);
  }

  public Set<ProductOnSale> getProductsOnSale() {
    return this.productsOnSale;
  }

}
