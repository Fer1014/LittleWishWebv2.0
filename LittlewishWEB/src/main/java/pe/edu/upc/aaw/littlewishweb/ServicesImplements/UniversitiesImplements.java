package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.Universities;
import pe.edu.upc.aaw.littlewishweb.Repository.UniversitiesRepository;
import pe.edu.upc.aaw.littlewishweb.Services.IUniversitiesService;

import java.util.List;

@Service
public class UniversitiesImplements implements IUniversitiesService {
    @Autowired
    private UniversitiesRepository uR;


    @Override
    public void insert(Universities universities) {
        uR.save(universities);
    }

    @Override
    public List<Universities> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int Id) {
        uR.deleteById(Id);
    }
}
