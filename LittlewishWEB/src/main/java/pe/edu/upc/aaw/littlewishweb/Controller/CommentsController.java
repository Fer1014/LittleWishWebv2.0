package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.CardDTO;
import pe.edu.upc.aaw.littlewishweb.Dtos.CommentsDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.Card;
import pe.edu.upc.aaw.littlewishweb.Entities.Comments;
import pe.edu.upc.aaw.littlewishweb.Services.ICommentsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comments")
public class CommentsController {
    @Autowired
    private ICommentsService cS;

    @PostMapping
    public void registrar(@RequestBody CommentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Comments c = m.map(dto, Comments.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CommentsDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CommentsDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void update(@RequestBody CommentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Comments c = m.map(dto, Comments.class);
        cS.insert(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }


}
