/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.EscuelaNueva.entity.distritoEntity;

/**
 *
 * @author Angel
 */

public interface distritoService {
    
    List<distritoEntity> FindAll();
    List<distritoEntity> FindAllCustom();
    Optional<distritoEntity> findById(Long Id);
    distritoEntity add (distritoEntity d);
    distritoEntity update (distritoEntity d);
    distritoEntity delete (distritoEntity d);
}
