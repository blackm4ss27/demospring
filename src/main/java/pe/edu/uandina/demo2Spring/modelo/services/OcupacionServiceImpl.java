/*
package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Ocupacion;
import pe.edu.uandina.demo2Spring.modelo.dao.IOcupacionDao;

import java.util.List;

@Service
public class OcupacionServiceImpl implements IOcupacionService{
    @Autowired
    private IOcupacionDao ocupacionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Ocupacion> findAll() {
        return (List<Ocupacion>) ocupacionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Ocupacion findById(Long id) {
        return ocupacionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Ocupacion save(Ocupacion ocupacion) {
        return ocupacionDao.save(ocupacion);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        ocupacionDao.deleteById(id);
    }
}
*/
