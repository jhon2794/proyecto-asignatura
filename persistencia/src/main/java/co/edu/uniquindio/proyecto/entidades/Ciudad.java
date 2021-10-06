package co.edu.uniquindio.proyecto.entidades;

import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Ciudad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @Column(length = 100,nullable = false)
    private  String nombre;

    public  Ciudad(){
        super();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ciudad ciudad = (Ciudad) o;

        return codigo.equals(ciudad.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
