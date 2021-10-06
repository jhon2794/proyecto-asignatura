package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@Entity
public class Libro implements Serializable {
    @Id
    private String isbn;
    @Column(nullable = true,length = 100)
    private String nombre;
    @Positive
    private Integer unidades;
    @Column(nullable = false,length = 100)
    private Integer anio;

    public Libro(){
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;

        return isbn.equals(libro.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
}
