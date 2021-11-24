package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Prestamo;
import pe.edu.uandina.demo2Spring.modelo.services.IPrestamoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PrestamoRestController {
    @Autowired
    private IPrestamoService prestamoService;

    @GetMapping("/prestamo")
    public List<Prestamo> listar(){
        return prestamoService.findAll();
    }

    @GetMapping("/prestamo/{id}")
    public Prestamo mostrar(@PathVariable Long id) {
        return prestamoService.findById(id);
    }

    @PostMapping("/prestamo")
    @ResponseStatus(HttpStatus.CREATED)
    public Prestamo crear(@RequestBody Prestamo prestamo) {
        return prestamoService.save(prestamo);
    }

    @PutMapping("/prestamo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Prestamo actualizar(@RequestBody Prestamo prestamo, @PathVariable Long id) {
        Prestamo prestamoOriginal = prestamoService.findById(id);
        prestamoOriginal.setMontoPrestamo(prestamo.getMontoPrestamo());
        return prestamoService.save(prestamoOriginal);
    }

    @DeleteMapping("/prestamo/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        prestamoService.delete(id);
    }

    /*@PostMapping("/prestamo")
    private String mensaje(){
        return "desde mensaje via post";
    }*/
}
