package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;
import pe.edu.upc.aaw.littlewishweb.Entities.CurriculumVitae;

import java.util.List;

public interface ICurriculumVitaeService {
    public void insert(CurriculumVitae curriculumVitae);
    public List<CurriculumVitae> list();
    public void delete(int Id);

}
