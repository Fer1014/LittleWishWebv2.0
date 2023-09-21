package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.UniversitiesDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.Universities;
import pe.edu.upc.aaw.littlewishweb.Services.IUniversitiesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Universities")
public class UniversitiesController {
    @Autowired
    private IUniversitiesService uS;

    @PostMapping
    public void registrar(@RequestBody UniversitiesDTO dto) {
        ModelMapper m = new ModelMapper();
        Universities u = m.map(dto, Universities.class);
        uS.insert(u);
    }

    @GetMapping
    public List<UniversitiesDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UniversitiesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        uS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody UniversitiesDTO dto) {
        ModelMapper m = new ModelMapper();
        Universities u = m.map(dto, Universities.class);
        uS.insert(u);
    }
}
