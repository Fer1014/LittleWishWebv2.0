package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.CurriculumVitae;
import pe.edu.upc.aaw.littlewishweb.Repository.CurriculumVitaeRepository;
import pe.edu.upc.aaw.littlewishweb.Services.ICurriculumVitaeService;

import java.util.List;

@Service
public class CurriculumVitaeImplements implements ICurriculumVitaeService {
    @Autowired
    private CurriculumVitaeRepository cvR;

    @Override
    public void insert(CurriculumVitae curriculumVitae) {
        cvR.save(curriculumVitae);
    }

    @Override
    public List<CurriculumVitae> list() {
        return cvR.findAll();
    }

    @Override
    public void delete(int Id) {
        cvR.deleteById(Id);

    }
}
