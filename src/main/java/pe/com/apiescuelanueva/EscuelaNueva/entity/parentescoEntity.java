
package pe.com.apiescuelanueva.EscuelaNueva.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Angel
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="parentescoEntity")
@Table(name="parentesco")
public class parentescoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codpar")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="despar")
    private String descripcion;
    @Column(name="estpar")
    private boolean estado;
}
