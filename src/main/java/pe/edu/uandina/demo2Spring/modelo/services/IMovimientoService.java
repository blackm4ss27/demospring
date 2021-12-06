package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Movimiento;

import java.util.List;

public interface IMovimientoService {
    public List<Movimiento> findAll();
    public Movimiento findById(Long id);
    public Movimiento save(Movimiento movimiento);
    public void delete(Long id);
}
