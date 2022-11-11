/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.EscuelaNueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.EscuelaNueva.entity.parentescoEntity;

/**
 *
 * @author Angel
 */
public interface parentescoRepository extends JpaRepository<parentescoEntity, Long>{
    @Query("select p from parentescoEntity p where p.estado=1")
    List<parentescoEntity> findallCustome();
}
