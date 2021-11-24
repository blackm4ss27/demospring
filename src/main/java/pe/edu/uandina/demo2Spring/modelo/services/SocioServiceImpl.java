package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Socio;
import pe.edu.uandina.demo2Spring.modelo.dao.ISocioDao;

import java.util.List;

@Service
public class SocioServiceImpl implements ISocioService{
    @Autowired
    private ISocioDao socioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Socio> findAll() {
        return (List<Socio>) socioDao.findAll();
    }
}
