package bd2.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

  @ManyToOne(fetch = FetchType.LAZY)
  private Provider provider;

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
   * @param provider Proveedor del producto
   */
  public Product(String name, float weight, Category category, Provider provider) {
    this.name = name;
    this.weight = weight;
    this.category = category;
    this.provider = provider;
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

  public Provider getProvider() {
    return this.provider;
  }

  public void setProvider(Provider provider) {
    this.provider = provider;
  }

}
