/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.EscuelaNueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.EscuelaNueva.entity.apoderadoEntity;

/**
 *
 * @author Angel
 */
public interface apoderadoRepository extends JpaRepository<apoderadoEntity, Long>{
    @Query("select a from apoderadoEntity a where a.estado=1")
    List<apoderadoEntity> findallCustome();
}
