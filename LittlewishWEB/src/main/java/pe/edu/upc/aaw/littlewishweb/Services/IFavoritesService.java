package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Favorites;

import java.util.List;

public interface IFavoritesService {
    void insert(Favorites favorites);
    public List<Favorites> list();
    public void delete(int Id);
}
