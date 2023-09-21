package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.CardDTO;
import pe.edu.upc.aaw.littlewishweb.Dtos.FavoritesDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.Card;
import pe.edu.upc.aaw.littlewishweb.Entities.Favorites;
import pe.edu.upc.aaw.littlewishweb.Services.IFavoritesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Favorites")
public class FavoritesController {
    @Autowired
    private IFavoritesService fS;
    @PostMapping
    public void insertar(@RequestBody FavoritesDTO dto){
        ModelMapper m = new ModelMapper();
        Favorites f = m.map(dto, Favorites.class);
        fS.insert(f);
    }

    @GetMapping
    public List<FavoritesDTO> listar() {
        return fS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, FavoritesDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void update(@RequestBody FavoritesDTO dto) {
        ModelMapper m = new ModelMapper();
        Favorites f = m.map(dto, Favorites.class);
        fS.insert(f);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        fS.delete(id);
    }
}
