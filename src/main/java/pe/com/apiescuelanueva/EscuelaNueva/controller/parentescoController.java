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
import pe.com.apiescuelanueva.EscuelaNueva.entity.parentescoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.service.parentescoService;

/**
 *
 * @author Angel
 */
@RestController
@RequestMapping("/parentesco")
public class parentescoController {
    @Autowired
    private parentescoService service;
    
    @GetMapping
    public List<parentescoEntity> findAll(){
        return service.FindAll();
    }
    @GetMapping("/custom")
    public List<parentescoEntity> findallCustom(){
        return service.FindAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<parentescoEntity> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public parentescoEntity add(@RequestBody parentescoEntity c){
        return service.add(c);
    }
    @PutMapping("/{id}")
    public parentescoEntity update (@PathVariable Long id, @RequestBody parentescoEntity c){
        c.setCodigo(id);
        return service.update(c);
    }
    @DeleteMapping("/{id}")
    public parentescoEntity delete (@PathVariable Long id){
        parentescoEntity objc = new parentescoEntity();
        objc.setEstado(false);
        return service.delete(parentescoEntity.builder().codigo(id).build());
    }
}
