package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.CarrersDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;
import pe.edu.upc.aaw.littlewishweb.Services.ICarrersService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Carrers")
public class CarrersController {
    @Autowired
    private ICarrersService cS;

    @PostMapping
    public void registrar(@RequestBody CarrersDTO dto) {
        ModelMapper m = new ModelMapper();
        Carrers c = m.map(dto, Carrers.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CarrersDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CarrersDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        cS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody CarrersDTO dto) {
        ModelMapper m = new ModelMapper();
        Carrers c = m.map(dto, Carrers.class);
        cS.insert(c);
    }
}
