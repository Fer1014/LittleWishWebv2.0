package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;
import pe.edu.upc.aaw.littlewishweb.Entities.WorkExperience;

import java.util.List;

public interface IWorkExperienceService {
    public void insert(WorkExperience workExperience);
    public List<WorkExperience> list();
    public void delete(int Id);

}
