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
import pe.com.apiescuelanueva.EscuelaNueva.entity.distritoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.repository.distritoRepository;

/**
 *
 * @author Angel
 */

@Service
public class distritoServiceImpl implements distritoService {

    @Autowired
    private distritoRepository distritorepository;
    
    @Override
    public List<distritoEntity> FindAll() {
        return distritorepository.findAll();
    }

    @Override
    public List<distritoEntity> FindAllCustom() {
        return distritorepository.findallCustome();
    }

    @Override
    public Optional<distritoEntity> findById(Long Id) {
        return distritorepository.findById(Id);
    }

    @Override
    public distritoEntity add(distritoEntity d) {
        return distritorepository.save(d);
    }

    @Override
    public distritoEntity update(distritoEntity d) {
        distritoEntity objd = distritorepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objd);
        return distritorepository.save(objd);
    }

    @Override
    public distritoEntity delete(distritoEntity d) {
        distritoEntity objd = distritorepository.getById(d.getCodigo());
        objd.setEstado(false);
        return distritorepository.save(objd);
    }
    
}
