package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.EducationProfileDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.EducationProfile;
import pe.edu.upc.aaw.littlewishweb.Services.IEducationProfileService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/EducationProfile")
public class EducationProfileController {
    @Autowired
    private IEducationProfileService epS;

    @PostMapping
    public void registrar(@RequestBody EducationProfileDTO dto) {
        ModelMapper m = new ModelMapper();
        EducationProfile ep = m.map(dto, EducationProfile.class);
        epS.insert(ep);
    }

    @GetMapping
    public List<EducationProfileDTO> listar() {
        return epS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EducationProfileDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        epS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody EducationProfileDTO dto) {
        ModelMapper m = new ModelMapper();
        EducationProfile c = m.map(dto, EducationProfile.class);
        epS.insert(c);
    }
}
