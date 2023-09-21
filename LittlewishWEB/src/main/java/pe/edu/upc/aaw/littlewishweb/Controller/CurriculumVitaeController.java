package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.CurriculumVitaeDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.CurriculumVitae;
import pe.edu.upc.aaw.littlewishweb.Services.ICurriculumVitaeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/CurriculumVitae")
public class CurriculumVitaeController {
    @Autowired
    private ICurriculumVitaeService cvS;

    @PostMapping
    public void registrar(@RequestBody CurriculumVitaeDTO dto) {
        ModelMapper m = new ModelMapper();
        CurriculumVitae c = m.map(dto, CurriculumVitae.class);
        cvS.insert(c);
    }

    @GetMapping
    public List<CurriculumVitaeDTO> listar() {
        return cvS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CurriculumVitaeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        cvS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody CurriculumVitaeDTO dto) {
        ModelMapper m = new ModelMapper();
        CurriculumVitae c = m.map(dto, CurriculumVitae.class);
        cvS.insert(c);
    }
}
