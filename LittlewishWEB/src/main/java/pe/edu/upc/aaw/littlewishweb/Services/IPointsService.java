package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Favorites;
import pe.edu.upc.aaw.littlewishweb.Entities.Points;

import java.util.List;

public interface IPointsService {
    void insert(Points points);
    public List<Points> list();
    public void delete(int Id);
}
