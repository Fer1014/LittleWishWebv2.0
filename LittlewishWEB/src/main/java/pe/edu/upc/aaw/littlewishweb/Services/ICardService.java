package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Card;
import pe.edu.upc.aaw.littlewishweb.Entities.Comments;

import java.util.List;

public interface ICardService {
    void insert(Card card);
    public List<Card> list();
    public void delete(int Id);
}
