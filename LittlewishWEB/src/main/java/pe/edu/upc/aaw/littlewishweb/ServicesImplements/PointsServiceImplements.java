package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.Points;
import pe.edu.upc.aaw.littlewishweb.Repository.PointsRepository;
import pe.edu.upc.aaw.littlewishweb.Services.IPointsService;

import java.util.List;
@Service
public class PointsServiceImplements implements IPointsService {

    @Autowired
    private PointsRepository pR;

    @Override
    public void insert(Points points) {
        pR.save(points);
    }

    @Override
    public List<Points> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int Id) {
        pR.deleteById(Id);

    }
}
