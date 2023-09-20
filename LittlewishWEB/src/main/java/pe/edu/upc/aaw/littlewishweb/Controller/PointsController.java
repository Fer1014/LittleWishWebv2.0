package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.PointsDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.Points;
import pe.edu.upc.aaw.littlewishweb.Services.IPointsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Points")
public class PointsController {
    @Autowired
    private IPointsService pS;
    @PostMapping
    public void insertar(@RequestBody PointsDTO dto){
        ModelMapper m = new ModelMapper();
        Points p = m.map(dto, Points.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PointsDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PointsDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }
}
