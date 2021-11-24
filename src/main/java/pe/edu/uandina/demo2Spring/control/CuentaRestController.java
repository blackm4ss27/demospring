package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Cuenta;
import pe.edu.uandina.demo2Spring.modelo.services.ICuentaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CuentaRestController {
    @Autowired
    private ICuentaService cuentaService;

    @GetMapping("/cuenta")
    public List<Cuenta> listar(){
        return cuentaService.findAll();
    }

    @GetMapping("/cuenta/{id}")
    public Cuenta mostrar(@PathVariable Long id) {
        return cuentaService.findById(id);
    }

    @PostMapping("/cuenta")
    @ResponseStatus(HttpStatus.CREATED)
    public Cuenta crear(@RequestBody Cuenta cuenta) {
        return cuentaService.save(cuenta);
    }

    @PutMapping("/cuenta/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cuenta actualizar(@RequestBody Cuenta cuenta, @PathVariable Long id) {
        Cuenta cuentaOriginal = cuentaService.findById(id);
        cuentaOriginal.setTipoCuenta(cuenta.getTipoCuenta());
        return cuentaService.save(cuentaOriginal);
    }

    @DeleteMapping("/cuenta/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        cuentaService.delete(id);
    }

    /*@PostMapping("/cuenta")
    private String mensaje(){
        return "desde mensaje via post";
    }*/
}
