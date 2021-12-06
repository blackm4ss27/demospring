package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "tipoprestamo")
    private String tipoPrestamo;
    @Column(name = "montoprestamo")
    private float montoPrestamo;
    @Column(name = "fecemision")
    private LocalDateTime fecEmision;
    @Column(name = "tasainteres")
    private float tasaInteres;
    //relaciones
    @ManyToOne
    @JoinColumn(name = "solicitadoporSocio", referencedColumnName = "id")
    @JsonBackReference (value = "solicitadoporSocio")
    private Socio solicitadoporSocio;

    public Prestamo() {
    }

    public Prestamo(String tipoPrestamo, float montoPrestamo, LocalDateTime fecEmision, float tasaInteres, Socio solicitadoporSocio) {
        this.tipoPrestamo = tipoPrestamo;
        this.montoPrestamo = montoPrestamo;
        this.fecEmision = fecEmision;
        this.tasaInteres = tasaInteres;
        this.solicitadoporSocio = solicitadoporSocio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(String tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public float getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(float montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public LocalDateTime getFecEmision() {
        return fecEmision;
    }

    public void setFecEmision(LocalDateTime fecEmision) {
        this.fecEmision = fecEmision;
    }

    public float getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public Socio getSolicitadoporSocio() {
        return solicitadoporSocio;
    }

    public void setSolicitadoporSocio(Socio solicitadoporSocio) {
        this.solicitadoporSocio = solicitadoporSocio;
    }
}
