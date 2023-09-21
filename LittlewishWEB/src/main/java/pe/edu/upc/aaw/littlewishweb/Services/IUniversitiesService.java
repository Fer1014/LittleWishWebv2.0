package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;
import pe.edu.upc.aaw.littlewishweb.Entities.Universities;

import java.util.List;

public interface IUniversitiesService {
    public void insert(Universities universities);
    public List<Universities> list();
    public void delete(int Id);

}
