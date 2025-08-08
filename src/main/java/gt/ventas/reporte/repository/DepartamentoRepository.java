package gt.ventas.reporte.repository;

import gt.ventas.reporte.model.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamentos, String> {
    //List<Departamentos> findAllBy();
}
