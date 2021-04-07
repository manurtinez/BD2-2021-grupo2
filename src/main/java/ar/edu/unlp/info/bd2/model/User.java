package ar.edu.unlp.info.bd2.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Clase que representa usuarios de la plataforma
 */
@Entity(name = "User")
@Table(name = "user")
public class User {

    /**
     * Clave primaria del objeto usuario
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    /**
     * Email del usuario
     */
    private String email;

    /**
     * Contraseña del usuario. Deberia ser un hash really
     */
    private String password;

    /**
     * Nombre completo del usuario
     */
    private String fullName;

    /**
     * Fecha de nacimiento del usuario
     */
    private Date birthDate;

    /**
     * Constructor vacio necesario
     */
    public User() {}

    /**
     * Constructor para la clase usuario
     * @param email El email del usuario
     * @param password La contraseña para el usuario
     * @param fullName El nombre completo del usuario
     * @param birthDate Fecha de nacimiento del usuario
     */
    public User(String email, String password, String fullName, Date birthDate) {
        this.setEmail(email);
        this.setPassword(password);
        this.setFullName(fullName);
        this.setBirthDate(birthDate);
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
