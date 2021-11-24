package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "socio")
public class Socio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nomSocio")
    private String nomSocio;
    @Column(name = "apSocio")
    private String apSocio;
    @Column(name = "dni")
    private String dni;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "fechaNac")
    private LocalDate fechaNac;
    @Column(name = "correo")
    private String correo;
    @Column(name = "celular")
    private String celular;
    //falta las relaciones
    @OneToOne
    @JoinColumn(name = "tieneUsuario", referencedColumnName = "id")
    private Usuario tieneUsuario;
    @OneToMany(mappedBy = "perteneceSocio")
    private List<Cuenta> tieneCuenta;
    @OneToMany(mappedBy = "solicitadoporSocio")
    @JsonManagedReference
    private List<Prestamo> solicitaPrestamos;
    //aaa
    @ManyToOne
    @JoinColumn(name = "tieneocupacion", referencedColumnName = "id")
    @JsonBackReference
    private Ocupacion tieneOcupacion;

    public Socio() {
    }

    public Socio(String nomSocio, String apSocio, String dni, String sexo, LocalDate fechaNac, String correo, String celular, Usuario tieneUsuario, List<Cuenta> tieneCuenta, List<Prestamo> solicitaPrestamos) {
        this.nomSocio = nomSocio;
        this.apSocio = apSocio;
        this.dni = dni;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.correo = correo;
        this.celular = celular;
        this.tieneUsuario = tieneUsuario;
        this.tieneCuenta = tieneCuenta;
        this.solicitaPrestamos = solicitaPrestamos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomSocio() {
        return nomSocio;
    }

    public void setNomSocio(String nomSocio) {
        this.nomSocio = nomSocio;
    }

    public String getApSocio() {
        return apSocio;
    }

    public void setApSocio(String apSocio) {
        this.apSocio = apSocio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Usuario getTieneUsuario() {
        return tieneUsuario;
    }

    public void setTieneUsuario(Usuario tieneUsuario) {
        this.tieneUsuario = tieneUsuario;
    }

    public List<Cuenta> getTieneCuenta() {
        if (this.tieneCuenta == null){
            this.tieneCuenta = new ArrayList<>();
        }
        return tieneCuenta;
    }

    public void setTieneCuenta(List<Cuenta> tieneCuenta) {
        this.tieneCuenta = tieneCuenta;
    }

    public List<Prestamo> getSolicitaPrestamos() {
        if (this.solicitaPrestamos == null){
            this.solicitaPrestamos = new ArrayList<>();
        }
        return solicitaPrestamos;
    }

    public void setSolicitaPrestamos(List<Prestamo> solicitaPrestamos) {
        this.solicitaPrestamos = solicitaPrestamos;
    }

    public Ocupacion getTieneOcupacion() {
        return tieneOcupacion;
    }

    public void setTieneOcupacion(Ocupacion tieneOcupacion) {
        this.tieneOcupacion = tieneOcupacion;
    }
}
