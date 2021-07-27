package bd2.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * Clase que representa un producto
 */

@Document(indexName = "productindex")
public class Product {

  @Id
  private Long id;

  private String name;
  private Float weight;

  private Category category;

  @Field(type = FieldType.Nested)
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
