package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;
import pe.edu.upc.aaw.littlewishweb.Entities.Languages;

import java.util.List;

public interface ILanguageService {
    public void insert(Languages languages);
    public List<Languages> list();
    public void delete(int Id);

}
