package gt.ventas.reporte.serviceInterface.ServiceImplements;

import gt.ventas.reporte.model.Departamentos;
import gt.ventas.reporte.repository.DepartamentoRepository;
import gt.ventas.reporte.serviceInterface.Idepartamento;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartamentoImplements implements Idepartamento {

    private final DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamentos> getDepartamentos() {
        List<Departamentos> departamentos = departamentoRepository.findAll();
        if (departamentos.isEmpty()) {
            System.out.println("No hay departamentos departamentos");
        }
        return departamentos;
    }
}

