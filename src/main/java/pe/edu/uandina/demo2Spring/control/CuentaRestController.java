package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uandina.demo2Spring.modelo.Cuenta;
import pe.edu.uandina.demo2Spring.modelo.services.ICuentaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CuentaRestController {
    @Autowired
    private ICuentaService cuentaService;

    @GetMapping("/cuentas")
    public List<Cuenta> listar(){
        return cuentaService.findAll();
    }

    @PostMapping("/cuentas")
    private String mensaje(){
        return "desde mensaje via post";
    }
}
