package pe.edu.uandina.demo2Spring.modelo;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "tipoCuenta")
    private String tipoCuenta;
    @Column(name = "saldo")
    private float saldo;
    @Column(name = "movimiento")
    private String movimiento;
    @Column (name = "fechaApertura")
    private LocalDateTime fechaApertura;
    @Column (name = "nroCuenta")
    private String nroCuenta;
    //relaciones
    @ManyToOne
    @JoinColumn(name = "perteneceSocio", referencedColumnName = "id")
    private Socio perteneceSocio;

    public Cuenta() {
    }

    public Cuenta(long id, String tipoCuenta, float saldo, String movimiento, LocalDateTime fechaApertura, String nroCuenta, Socio perteneceSocio) {
        this.id = id;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.movimiento = movimiento;
        this.fechaApertura = fechaApertura;
        this.nroCuenta = nroCuenta;
        this.perteneceSocio = perteneceSocio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDateTime fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Socio getPerteneceSocio() {
        return perteneceSocio;
    }

    public void setPerteneceSocio(Socio perteneceSocio) {
        this.perteneceSocio = perteneceSocio;
    }
}
