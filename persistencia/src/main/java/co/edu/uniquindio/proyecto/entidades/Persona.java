package co.edu.uniquindio.proyecto.entidades;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = false)
public class Persona implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private  String cedula;
    @Column(nullable = false,length = 100)
    private  String nombre;
    @Column(nullable = false,length = 100,unique = true)
    private  String email;
    @ElementCollection
    @Column(nullable = false)
    private Map<String, String> numTelefono;
    @Enumerated(EnumType.STRING)
    private GeneroPersona genero;



}
