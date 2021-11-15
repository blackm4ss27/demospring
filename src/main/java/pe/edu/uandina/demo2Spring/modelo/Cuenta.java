package pe.edu.uandina.demo2Spring.modelo;

import javax.persistence.*;
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
    //relaciones
    @ManyToOne
    @JoinColumn(name = "perteneceSocio", referencedColumnName = "id")
    private Socio perteneceSocio;

    public Cuenta() {
    }

    public Cuenta(String tipoCuenta, float saldo, String movimiento, Socio perteneceSocio) {
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.movimiento = movimiento;
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

    public Socio getPerteneceSocio() {
        return perteneceSocio;
    }

    public void setPerteneceSocio(Socio perteneceSocio) {
        this.perteneceSocio = perteneceSocio;
    }
}
