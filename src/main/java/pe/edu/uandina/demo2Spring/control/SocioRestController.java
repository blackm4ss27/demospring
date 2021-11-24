package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uandina.demo2Spring.modelo.Socio;
import pe.edu.uandina.demo2Spring.modelo.services.ISocioService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SocioRestController {
    @Autowired
    private ISocioService socioService;

    @GetMapping("/socios")
    public List<Socio> listar(){
        return socioService.findAll();
    }

    @PostMapping("/socios")
    private String mensaje(){
        return "desde mensaje via post";
    }
}
