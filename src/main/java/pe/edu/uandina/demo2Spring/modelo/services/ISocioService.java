package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Prestamo;
import pe.edu.uandina.demo2Spring.modelo.Socio;

import java.util.List;

public interface ISocioService {
    public List<Socio> findAll();
    public Socio findById(Long id);
    public Socio save(Socio socio);
    public void delete(Long id);
}
