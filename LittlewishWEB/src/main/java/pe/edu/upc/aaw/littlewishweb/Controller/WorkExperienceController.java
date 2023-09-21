package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.WorkExperienceDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.WorkExperience;
import pe.edu.upc.aaw.littlewishweb.Services.IWorkExperienceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/WorkExperience")
public class WorkExperienceController {
    @Autowired
    private IWorkExperienceService weS;

    @PostMapping
    public void registrar(@RequestBody WorkExperienceDTO dto) {
        ModelMapper m = new ModelMapper();
        WorkExperience u = m.map(dto, WorkExperience.class);
        weS.insert(u);
    }

    @GetMapping
    public List<WorkExperienceDTO> listar() {
        return weS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, WorkExperienceDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        weS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody WorkExperienceDTO dto) {
        ModelMapper m = new ModelMapper();
        WorkExperience exp = m.map(dto, WorkExperience.class);
        weS.insert(exp);
    }
}
