package pe.edu.upc.aaw.littlewishweb.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishweb.Dtos.CardDTO;
import pe.edu.upc.aaw.littlewishweb.Entities.Card;
import pe.edu.upc.aaw.littlewishweb.Services.ICardService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Card")
public class CardController {
    @Autowired
    private ICardService cS;

    @PostMapping
    public void Registrar(@RequestBody CardDTO dto){
        ModelMapper m=new ModelMapper();
        Card c=m.map(dto, Card.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CardDTO> listar(){
        return  cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CardDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void update(@RequestBody CardDTO dto) {
        ModelMapper m = new ModelMapper();
        Card c = m.map(dto, Card.class);
        cS.insert(c);
    }
}
