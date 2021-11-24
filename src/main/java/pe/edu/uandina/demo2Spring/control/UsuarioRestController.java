package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Usuario;
import pe.edu.uandina.demo2Spring.modelo.services.IUsuarioService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuario")
    public List<Usuario> listar(){
        return usuarioService.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Usuario mostrar(@PathVariable Long id) {
        return usuarioService.findById(id);
    }

    @PostMapping("/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @PutMapping("/usuario/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario actualizar(@RequestBody Usuario usuario, @PathVariable Long id) {
        Usuario usuarioOriginal = usuarioService.findById(id);
        usuarioOriginal.setLogin(usuario.getLogin());
        return usuarioService.save(usuarioOriginal);
    }

    @DeleteMapping("/usuario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        usuarioService.delete(id);
    }

    /*@PostMapping("/usuario")
    private String mensaje(){
        return "desde mensaje via post";
    }*/
}
