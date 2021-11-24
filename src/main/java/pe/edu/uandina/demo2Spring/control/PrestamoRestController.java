package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uandina.demo2Spring.modelo.Prestamo;
import pe.edu.uandina.demo2Spring.modelo.services.IPrestamoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PrestamoRestController {
    @Autowired
    private IPrestamoService prestamoService;

    @GetMapping("/prestamos")
    public List<Prestamo> listar(){
        return prestamoService.findAll();
    }

    @PostMapping("/prestamos")
    private String mensaje(){
        return "desde mensaje via post";
    }
}
