/*
package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
    //aaa
    @Column(name = "createdat")
    private LocalDateTime createdAt;
    @Column(name = "sueldobase", scale = 2, precision = 7)
    private BigDecimal sueldoBase;
    @OneToMany(mappedBy = "tieneOcupacion")
    @JsonManagedReference
    private List<Socio> socios;

    public Ocupacion() {
    }

    */
/*public Ocupacion(String nombre, List<Socio> socios) {
        this.nombre = nombre;
        this.socios = socios;
    }*//*


    public Ocupacion(String nombre, LocalDateTime createdAt, BigDecimal sueldoBase, List<Socio> socios) {
        this.nombre = nombre;
        this.createdAt = createdAt;
        this.sueldoBase = sueldoBase;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(BigDecimal sueldoBase) {
        this.sueldoBase = sueldoBase;
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
*/
