package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Cuenta;
import pe.edu.uandina.demo2Spring.modelo.dao.ICuentaDao;

import java.util.List;

@Service
public class CuentaServiceImpl implements ICuentaService{
    @Autowired
    private ICuentaDao cuentaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cuenta> findAll() {
        return (List<Cuenta>) cuentaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cuenta findById(Long id) {
        return cuentaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cuenta save(Cuenta cuenta) {
        return cuentaDao.save(cuenta);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        cuentaDao.deleteById(id);
    }
}
