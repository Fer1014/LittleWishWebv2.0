package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.Card;
import pe.edu.upc.aaw.littlewishweb.Repository.CardRepository;
import pe.edu.upc.aaw.littlewishweb.Services.ICardService;

import java.util.List;

@Service
public class CardServiceImplements implements ICardService {
    @Autowired
    private CardRepository cR;

    @Override
    public void insert(Card card) {
        cR.save(card);
    }

    @Override
    public List<Card> list() {
        return cR.findAll();
    }


    @Override
    public void delete(int Id) {
        cR.deleteById(Id);

    }
}
