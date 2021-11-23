package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Cuenta;

public interface ICuentaDao extends CrudRepository<Cuenta, Long> {
}
