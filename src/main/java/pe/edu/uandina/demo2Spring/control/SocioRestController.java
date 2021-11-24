package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Socio;
import pe.edu.uandina.demo2Spring.modelo.services.ISocioService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SocioRestController {
    @Autowired
    private ISocioService socioService;

    @GetMapping("/socio")
    public List<Socio> listar(){
        return socioService.findAll();
    }

    @GetMapping("/socio/{id}")
    public Socio mostrar(@PathVariable Long id) {
        return socioService.findById(id);
    }

    @PostMapping("/socio")
    @ResponseStatus(HttpStatus.CREATED)
    public Socio crear(@RequestBody Socio socio) {
        return socioService.save(socio);
    }

    @PutMapping("/socio/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Socio actualizar(@RequestBody Socio socio, @PathVariable Long id) {
        Socio socioOriginal = socioService.findById(id);
        socioOriginal.setNomSocio(socio.getNomSocio());
        return socioService.save(socioOriginal);
    }

    @DeleteMapping("/socio/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        socioService.delete(id);
    }

    /*@PostMapping("/socio")
    private String mensaje(){
        return "desde mensaje via post";
    }*/
}
