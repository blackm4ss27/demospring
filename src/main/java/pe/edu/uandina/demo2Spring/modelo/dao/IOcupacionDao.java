package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Ocupacion;

public interface IOcupacionDao extends CrudRepository<Ocupacion, Long> {
}
