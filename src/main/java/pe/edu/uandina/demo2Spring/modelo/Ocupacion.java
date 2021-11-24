package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ocupacion")
public class Ocupacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "tieneOcupacion")
    @JsonManagedReference
    private List<Socio> socios;

    public Ocupacion() {
    }

    public Ocupacion(String nombre, List<Socio> socios) {
        this.nombre = nombre;
        this.socios = socios;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Socio> getSocios() {
        if (this.socios == null){
            this.socios = new ArrayList<>();
        }
        return socios;
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }
}
