package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.WorkExperience;
import pe.edu.upc.aaw.littlewishweb.Repository.WorkExperienceRepository;
import pe.edu.upc.aaw.littlewishweb.Services.IWorkExperienceService;

import java.util.List;

@Service
public class WorkExperienceImplements implements IWorkExperienceService {
    @Autowired
    private WorkExperienceRepository weR;

    @Override
    public void insert(WorkExperience workExperience) {
        weR.save(workExperience);
    }

    @Override
    public List<WorkExperience> list() {
        return weR.findAll();
    }

    @Override
    public void delete(int Id) {
        weR.deleteById(Id);
    }
}
