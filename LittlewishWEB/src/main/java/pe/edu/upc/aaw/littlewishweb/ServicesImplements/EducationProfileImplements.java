package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.EducationProfile;
import pe.edu.upc.aaw.littlewishweb.Repository.EducationProfileRepository;
import pe.edu.upc.aaw.littlewishweb.Services.IEducationProfileService;

import java.util.List;

@Service
public class EducationProfileImplements implements IEducationProfileService {
    @Autowired
    private EducationProfileRepository eR;

    @Override
    public void insert(EducationProfile educationProfile) {
        eR.save(educationProfile);
    }

    @Override
    public List<EducationProfile> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int Id) {
        eR.deleteById(Id);
    }
}
