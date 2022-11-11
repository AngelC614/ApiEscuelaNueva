/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apiescuelanueva.EscuelaNueva.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apiescuelanueva.EscuelaNueva.entity.apoderadoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.service.apoderadoService;

/**
 *
 * @author Angel
 */
@RestController
@RequestMapping("/apoderado")
public class apoderadoController {
    @Autowired
    private apoderadoService service;
    
    @GetMapping
    public List<apoderadoEntity> findAll(){
        return service.FindAll();
    }
    @GetMapping("/custom")
    public List<apoderadoEntity> findallCustom(){
        return service.FindAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<apoderadoEntity> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public apoderadoEntity add(@RequestBody apoderadoEntity c){
        return service.add(c);
    }
    @PutMapping("/{id}")
    public apoderadoEntity update (@PathVariable Long id, @RequestBody apoderadoEntity c){
        c.setCodigo(id);
        return service.update(c);
    }
    @DeleteMapping("/{id}")
    public apoderadoEntity delete (@PathVariable Long id){
        apoderadoEntity objc = new apoderadoEntity();
        objc.setEstado(false);
        return service.delete(apoderadoEntity.builder().codigo(id).build());
    }
}
