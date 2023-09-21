package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;
import pe.edu.upc.aaw.littlewishweb.Entities.Certifications;

import java.util.List;

public interface ICertificationsService {
    public void insert(Certifications certifications);
    public List<Certifications> list();
    public void delete(int Id);

}
