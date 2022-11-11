/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.EscuelaNueva.entity.apoderadoEntity;

/**
 *
 * @author Angel
 */

public interface apoderadoService {
    List<apoderadoEntity> FindAll();
    List<apoderadoEntity> FindAllCustom();
    Optional<apoderadoEntity> findById(Long Id);
    apoderadoEntity add (apoderadoEntity a);
    apoderadoEntity update (apoderadoEntity a);
    apoderadoEntity delete (apoderadoEntity a);
}
