/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.EscuelaNueva.entity.parentescoEntity;

/**
 *
 * @author Angel
 */

public interface parentescoService {
    List<parentescoEntity> FindAll();
    List<parentescoEntity> FindAllCustom();
    Optional<parentescoEntity> findById(Long Id);
    parentescoEntity add (parentescoEntity p);
    parentescoEntity update (parentescoEntity p);
    parentescoEntity delete (parentescoEntity p);
}
