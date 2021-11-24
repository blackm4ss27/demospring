package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Cuenta;

import java.util.List;

public interface ICuentaService {
    public List<Cuenta> findAll();
    public Cuenta findById(Long id);
    public Cuenta save(Cuenta cuenta);
    public void delete(Long id);
}
