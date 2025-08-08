package gt.ventas.reporte.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "departamento", schema = "sistema_ventas")
public class Departamentos {

    @Id
    @Column(name = "codigo_departamento", length = 3)
    private String codigo_depa;

    @Column(name = "nombre_departamento", length = 100)
    private String nombre_depa;

    @Column(name = "estado")
    private Boolean estado;
}
