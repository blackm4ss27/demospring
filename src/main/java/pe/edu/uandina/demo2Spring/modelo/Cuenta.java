package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
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
    @Column(name = "tipocuenta")
    private String tipoCuenta;
    @Column (name = "nrocuenta")
    private String nroCuenta;
    @Column(name = "saldo")
    private BigDecimal saldo;
    /*@Column(name = "movimiento")
    private String movimiento;*/
    @Column (name = "fechaapertura")
    private LocalDateTime fechaApertura;
    //relaciones
    @ManyToOne
    @JoinColumn(name = "perteneceSocio", referencedColumnName = "id")
    @JsonBackReference (value = "perteneceSocio")
    private Socio perteneceSocio;
    @OneToMany(mappedBy = "perteneceCuenta")
    @JsonManagedReference (value = "perteneceCuenta")
    private List<Movimiento> tieneMovimientos;

    public Cuenta() {
    }

    public Cuenta(String tipoCuenta, String nroCuenta, BigDecimal saldo, LocalDateTime fechaApertura, Socio perteneceSocio) {
        this.tipoCuenta = tipoCuenta;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
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

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    /*public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }*/

    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDateTime fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Socio getPerteneceSocio() {
        return perteneceSocio;
    }

    public void setPerteneceSocio(Socio perteneceSocio) {
        this.perteneceSocio = perteneceSocio;
    }

    public List<Movimiento> getTieneMovimientos() {
        if(this.tieneMovimientos == null){
            this.tieneMovimientos = new ArrayList<>();
        }
        return tieneMovimientos;
    }

    public void setTieneMovimientos(List<Movimiento> tieneMovimientos) {
        this.tieneMovimientos = tieneMovimientos;
    }
}
