package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;
import pe.edu.upc.aaw.littlewishweb.Entities.EducationProfile;

import java.util.List;

public interface IEducationProfileService {
    public void insert(EducationProfile educationProfile);
    public List<EducationProfile> list();
    public void delete(int Id);

}
