package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Prestamo;

public interface IPrestamoDao extends CrudRepository<Prestamo, Long> {
}
