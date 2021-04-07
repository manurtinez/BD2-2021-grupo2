package ar.edu.unlp.info.bd2.model;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    /**
     * Constructor vacio necesario
     */
    public Category() {}

    /**
     * Constructor para la clase Categoria
     * @param name El nombre de la categoria
     */
    public Category(String name) {
        this.setName(name);
    }

    /**
     * Nombre de la categoria
     */
    private String name;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
