package bd2.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * Clase que representa una categoria
 */
@Document(indexName = "categoryIndex")
public class Category {

    /**
     * Clave primaria del objeto
     */
    @Id
    private Long id;

    /**
     * Constructor vacio necesario
     */
    public Category() {
    }

    /**
     * Constructor para la clase Categoria
     * 
     * @param name El nombre de la categoria
     */
    public Category(String name) {
        this.setName(name);
    }

    /**
     * Nombre de la categoria
     */
    private String name;

    @Field(type = FieldType.Nested)
    private Set<Product> products = new HashSet<Product>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
