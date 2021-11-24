package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Socio;

public interface ISocioDao extends CrudRepository<Socio, Long> {
}
