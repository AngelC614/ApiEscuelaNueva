/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apiescuelanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.EscuelaNueva.entity.apoderadoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.repository.apoderadoRepository;

/**
 *
 * @author Angel
 */
@Service
public class apoderadoServiceImpl implements apoderadoService {

    @Autowired
    private apoderadoRepository apoderadorepository;

    @Override
    public List<apoderadoEntity> FindAll() {
        return apoderadorepository.findAll();
    }

    @Override
    public List<apoderadoEntity> FindAllCustom() {
        return apoderadorepository.findallCustome();
    }

    @Override
    public Optional<apoderadoEntity> findById(Long Id) {
        return apoderadorepository.findById(Id);
    }

    @Override
    public apoderadoEntity add(apoderadoEntity a) {
        return apoderadorepository.save(a);
    }

    @Override
    public apoderadoEntity update(apoderadoEntity a) {
        apoderadoEntity obja = apoderadorepository.getById(a.getCodigo());
        BeanUtils.copyProperties(a, obja);
        return apoderadorepository.save(obja);
    }

    @Override
    public apoderadoEntity delete(apoderadoEntity a) {
        apoderadoEntity obja = apoderadorepository.getById(a.getCodigo());
        obja.setEstado(false);
        return apoderadorepository.save(obja);
    }
    
    
}
