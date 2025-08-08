package gt.ventas.reporte.controller;

import gt.ventas.reporte.model.Departamentos;
import gt.ventas.reporte.serviceInterface.Idepartamento;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departamento")
@RequiredArgsConstructor
public class DepartamentoController {
    private final Idepartamento interfaceDepartamento;

    @GetMapping("/departamentos")
    public List<Departamentos> listaDepartamentos() {
        return interfaceDepartamento.getDepartamentos();
    }
}
