package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.Objects;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Autor implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @Getter @Setter
    @Column(nullable = false,length = 100)
    private String nombre;
    @Getter @Setter
    @Max(9999)
    @Column(nullable = true,precision = 4)
    private Integer anioNacimineto;

    public Autor(String nombre, Integer anioNacimineto) {
        this.nombre = nombre;
        this.anioNacimineto = anioNacimineto;
    }
}
