package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.LanguagesDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.Languages;
import pe.edu.upc.aaw.littlewishweb.Services.ILanguageService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Languages")
public class LanguagesController {
    @Autowired
    private ILanguageService lS;

    @PostMapping
    public void registrar(@RequestBody LanguagesDTO dto) {
        ModelMapper m = new ModelMapper();
        Languages l = m.map(dto, Languages.class);
        lS.insert(l);
    }

    @GetMapping
    public List<LanguagesDTO> listar() {
        return lS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LanguagesDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        lS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody LanguagesDTO dto) {
        ModelMapper m = new ModelMapper();
        Languages l = m.map(dto, Languages.class);
        lS.insert(l);
    }
}
