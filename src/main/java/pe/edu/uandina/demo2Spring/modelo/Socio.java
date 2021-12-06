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
    @Column(name = "nomsocio")
    private String nomSocio;
    @Column(name = "apsocio")
    private String apSocio;
    @Column(name = "dni")
    private String dni;
    @Column(name = "sexo")
    private String sexo;
    //nuevos atributos
    @Column(name = "ocupacion")
    private String ocupacion;
    @Column(name = "fechanac")
    private LocalDate fechaNac;
    @Column(name = "correo")
    private String correo;
    @Column(name = "celular")
    private String celular;
    @Column(name = "login")
    private String login;
    @Column(name = "contrasena")
    private String contrasena;
    //falta las relaciones
    /*@OneToOne
    @JoinColumn(name = "tieneUsuario", referencedColumnName = "id")
    private Usuario tieneUsuario;*/
    @OneToMany(mappedBy = "perteneceSocio")
    @JsonManagedReference (value = "perteneceSocio")
    private List<Cuenta> tieneCuenta;
    @OneToMany(mappedBy = "solicitadoporSocio")
    @JsonManagedReference (value = "solicitadoporSocio")
    private List<Prestamo> solicitaPrestamos;
    //aaa
    //esto de abajo era codigo antiguo para la prueba del postman, solo prueba pero ahora lo comentare
    /*@ManyToOne
    @JoinColumn(name = "tieneocupacion", referencedColumnName = "id")
    @JsonBackReference
    private Ocupacion tieneOcupacion;*/

    public Socio() {
    }

    public Socio(String nomSocio, String apSocio, String dni, String sexo, String ocupacion, LocalDate fechaNac, String correo, String celular, String login, String contrasena, List<Cuenta> tieneCuenta, List<Prestamo> solicitaPrestamos) {
        this.nomSocio = nomSocio;
        this.apSocio = apSocio;
        this.dni = dni;
        this.sexo = sexo;
        this.ocupacion = ocupacion;
        this.fechaNac = fechaNac;
        this.correo = correo;
        this.celular = celular;
        this.login = login;
        this.contrasena = contrasena;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /*public Usuario getTieneUsuario() {
        return tieneUsuario;
    }

    public void setTieneUsuario(Usuario tieneUsuario) {
        this.tieneUsuario = tieneUsuario;
    }*/

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

    /*public Ocupacion getTieneOcupacion() {
        return tieneOcupacion;
    }

    public void setTieneOcupacion(Ocupacion tieneOcupacion) {
        this.tieneOcupacion = tieneOcupacion;
    }*/
}
