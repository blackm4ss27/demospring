package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Ocupacion;
import pe.edu.uandina.demo2Spring.modelo.services.IOcupacionService;

import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OcupacionRestController {
    @Autowired
    private IOcupacionService ocupacionService;

    @GetMapping("/ocupacion")
    public List<Ocupacion> listar(){
        return ocupacionService.findAll();
    }

    @GetMapping("/ocupacion/{id}")
    public Ocupacion mostrar(@PathVariable Long id) {
        return ocupacionService.findById(id);
    }

    @PostMapping("/ocupacion")
    @ResponseStatus(HttpStatus.CREATED)
    public Ocupacion crear(@RequestBody Ocupacion ocupacion) {
        ocupacion.setCreatedAt(LocalDateTime.now());
        ocupacion.setSueldoBase(ocupacion.getSueldoBase().setScale(2, RoundingMode.HALF_UP));
        return ocupacionService.save(ocupacion);
    }

    @PutMapping("/ocupacion/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Ocupacion actualizar(@RequestBody Ocupacion ocupacion, @PathVariable Long id) {
        Ocupacion ocupacionOriginal = ocupacionService.findById(id);
        ocupacionOriginal.setNombre(ocupacion.getNombre());
        return ocupacionService.save(ocupacionOriginal);
    }

    @DeleteMapping("/ocupacion/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        ocupacionService.delete(id);
    }

    /*@PostMapping("/usuario")
    private String mensaje(){
        return "desde mensaje via post";
    }*/
}
