package bd2.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Clase que representa un producto
 */
@Entity(name = "Product")
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private String name;
  private float weight;

  @ManyToOne(fetch = FetchType.LAZY)
  private Category category;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
  private Set<ProductProvider> products = new HashSet<ProductProvider>();

  /**
   * Constructor vacio necesario
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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getWeight() {
    return this.weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public Category getCategory() {
    return this.category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

}
