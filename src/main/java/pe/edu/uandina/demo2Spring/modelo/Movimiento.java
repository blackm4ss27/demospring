package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "movimiento")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "tipomov")
    private String tipoMov;
    @Column(name = "montomov")
    private BigDecimal montoMov;
    @Column(name = "fechahoramov")
    private LocalDateTime fechahoraMov;
    //relaciones
    @ManyToOne
    @JoinColumn(name = "perteneceCuenta", referencedColumnName = "id")
    @JsonBackReference (value = "perteneceCuenta")
    private Cuenta perteneceCuenta;

    public Movimiento() {
    }

    public Movimiento(String tipoMov, BigDecimal montoMov, LocalDateTime fechahoraMov, Cuenta perteneceCuenta) {
        this.tipoMov = tipoMov;
        this.montoMov = montoMov;
        this.fechahoraMov = fechahoraMov;
        this.perteneceCuenta = perteneceCuenta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public BigDecimal getMontoMov() {
        return montoMov;
    }

    public void setMontoMov(BigDecimal montoMov) {
        this.montoMov = montoMov;
    }

    public LocalDateTime getFechahoraMov() {
        return fechahoraMov;
    }

    public void setFechahoraMov(LocalDateTime fechahoraMov) {
        this.fechahoraMov = fechahoraMov;
    }

    public Cuenta getPerteneceCuenta() {
        return perteneceCuenta;
    }

    public void setPerteneceCuenta(Cuenta perteneceCuenta) {
        this.perteneceCuenta = perteneceCuenta;
    }
}
