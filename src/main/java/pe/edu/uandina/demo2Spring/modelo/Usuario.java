/*
package pe.edu.uandina.demo2Spring.modelo;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "login")
    private String login;
    @Column(name = "contrasena")
    private String contrasena;
    @OneToOne(mappedBy = "tieneUsuario")
    private Socio esdeSocio;

    public Usuario() {
    }

    public Usuario(String login, String contrasena) {
        this.login = login;
        this.contrasena = contrasena;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Socio getEsdeSocio() {
        return esdeSocio;
    }

    public void setEsdeSocio(Socio esdeSocio) {
        this.esdeSocio = esdeSocio;
    }
}
*/
