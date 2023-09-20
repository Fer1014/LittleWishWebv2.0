package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.Favorites;
import pe.edu.upc.aaw.littlewishweb.Repository.FavoritesRepository;
import pe.edu.upc.aaw.littlewishweb.Services.IFavoritesService;

import java.util.List;

@Service
public class FavoritesServiceImplements implements IFavoritesService {

    @Autowired
    private FavoritesRepository fR;

    @Override
    public void insert(Favorites favorites) {
        fR.save(favorites);
    }

    @Override
    public List<Favorites> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int Id) {
        fR.deleteById(Id);

    }
}
