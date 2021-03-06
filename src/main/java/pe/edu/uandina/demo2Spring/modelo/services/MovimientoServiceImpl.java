package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Movimiento;
import pe.edu.uandina.demo2Spring.modelo.dao.IMovimientoDao;

import java.util.List;

@Service
public class MovimientoServiceImpl implements IMovimientoService{
    @Autowired
    private IMovimientoDao movimientoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Movimiento> findAll() {
        return (List<Movimiento>) movimientoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Movimiento findById(Long id) {
        return movimientoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Movimiento save(Movimiento movimiento) {
        return movimientoDao.save(movimiento);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        movimientoDao.deleteById(id);
    }
}
