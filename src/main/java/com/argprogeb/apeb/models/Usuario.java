package com.argprogeb.apeb.models;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable =false, updatable =false)
    private Long id;
    private String nombre;
    private String apellido;
    private String descripcion;
    @OneToMany(fetch =FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionlist;

    public Usuario(Long id, String nombre, String apellido, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
    }

    public Usuario() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

