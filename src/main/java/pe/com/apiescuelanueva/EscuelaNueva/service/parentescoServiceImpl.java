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
import pe.com.apiescuelanueva.EscuelaNueva.entity.parentescoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.repository.parentescoRepository;

/**
 *
 * @author Angel
 */

@Service
public class parentescoServiceImpl implements parentescoService {

    @Autowired
    private parentescoRepository parentescorepository;
    
    @Override
    public List<parentescoEntity> FindAll() {
        return parentescorepository.findAll();
    }

    @Override
    public List<parentescoEntity> FindAllCustom() {
        return parentescorepository.findallCustome();
    }

    @Override
    public Optional<parentescoEntity> findById(Long Id) {
        return parentescorepository.findById(Id);
    }

    @Override
    public parentescoEntity add(parentescoEntity p) {
        return parentescorepository.save(p);
    }

    @Override
    public parentescoEntity update(parentescoEntity p) {
        parentescoEntity obja = parentescorepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, obja);
        return parentescorepository.save(obja);
    }

    @Override
    public parentescoEntity delete(parentescoEntity p) {
        parentescoEntity obja = parentescorepository.getById(p.getCodigo());
        obja.setEstado(false);
        return parentescorepository.save(obja);
    }
    
}
