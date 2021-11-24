package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Prestamo;

import java.util.List;

public interface IPrestamoService {
    public List<Prestamo> findAll();
    public Prestamo findById(Long id);
    public Prestamo save(Prestamo prestamo);
    public void delete(Long id);
}
