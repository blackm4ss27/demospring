package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Movimiento;
import pe.edu.uandina.demo2Spring.modelo.services.IMovimientoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovimientoRestController {
    @Autowired
    private IMovimientoService movimientoService;

    @GetMapping("/movimiento")
    public List<Movimiento> listar(){
        return movimientoService.findAll();
    }

    @GetMapping("/movimiento/{id}")
    public Movimiento mostrar(@PathVariable Long id) {
        return movimientoService.findById(id);
    }

    @PostMapping("/movimiento")
    @ResponseStatus(HttpStatus.CREATED)
    public Movimiento crear(@RequestBody Movimiento movimiento) {
        return movimientoService.save(movimiento);
    }

    @PutMapping("/movimiento/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Movimiento actualizar(@RequestBody Movimiento movimiento, @PathVariable Long id) {
        Movimiento movimientoOriginal = movimientoService.findById(id);
        movimientoOriginal.setTipoMov(movimiento.getTipoMov());
        movimientoOriginal.setMontoMov(movimiento.getMontoMov());
        movimientoOriginal.setFechahoraMov(movimiento.getFechahoraMov());
        return movimientoService.save(movimientoOriginal);
    }

    @DeleteMapping("/movimiento/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        movimientoService.delete(id);
    }
}
