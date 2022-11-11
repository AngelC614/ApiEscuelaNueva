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
import pe.com.apiescuelanueva.EscuelaNueva.entity.distritoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.service.distritoService;

/**
 *
 * @author Angel
 */

@RestController
@RequestMapping("/distrito")
public class distritoController {
    @Autowired
    private distritoService service;
    
    @GetMapping
    public List<distritoEntity> findAll(){
        return service.FindAll();
    }
    @GetMapping("/custom")
    public List<distritoEntity> findallCustom(){
        return service.FindAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<distritoEntity> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public distritoEntity add(@RequestBody distritoEntity c){
        return service.add(c);
    }
    @PutMapping("/{id}")
    public distritoEntity update (@PathVariable Long id, @RequestBody distritoEntity c){
        c.setCodigo(id);
        return service.update(c);
    }
    @DeleteMapping("/{id}")
    public distritoEntity delete (@PathVariable Long id){
        distritoEntity objc = new distritoEntity();
        objc.setEstado(false);
        return service.delete(distritoEntity.builder().codigo(id).build());
    }
}
