package bd2.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

/**
 * Clase que representa una categoria
 */

@Entity(name = "Category")
@Table(name = "category")
public class Category {

    /**
     * Clave primaria del objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
