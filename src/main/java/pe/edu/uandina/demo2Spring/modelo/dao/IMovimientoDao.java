package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Movimiento;

public interface IMovimientoDao extends CrudRepository<Movimiento, Long> {
}
