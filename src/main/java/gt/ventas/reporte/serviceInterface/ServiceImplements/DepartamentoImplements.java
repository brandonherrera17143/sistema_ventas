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
        return departamentoRepository.findAll();
    }
}
