package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Prestamo;
import pe.edu.uandina.demo2Spring.modelo.dao.IPrestamoDao;

import java.util.List;

@Service
public class PrestamoServiceImpl implements IPrestamoService{
    @Autowired
    private IPrestamoDao prestamoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Prestamo> findAll() {
        return (List<Prestamo>) prestamoDao.findAll();
    }
}
