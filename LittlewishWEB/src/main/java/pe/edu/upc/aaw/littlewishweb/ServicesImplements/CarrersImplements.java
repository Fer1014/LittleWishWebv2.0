package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;
import pe.edu.upc.aaw.littlewishweb.Repository.CarrersRepository;
import pe.edu.upc.aaw.littlewishweb.Services.ICarrersService;

import java.util.List;

@Service
public class CarrersImplements implements ICarrersService {
    @Autowired
    private CarrersRepository cR;

    @Override
    public void insert(Carrers carrers) {
        cR.save(carrers);
    }

    @Override
    public List<Carrers> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int Id) {
        cR.deleteById(Id);
    }
}
