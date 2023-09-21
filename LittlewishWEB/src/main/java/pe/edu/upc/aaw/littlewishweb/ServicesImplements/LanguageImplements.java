package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.Languages;
import pe.edu.upc.aaw.littlewishweb.Repository.LanguagesRepository;
import pe.edu.upc.aaw.littlewishweb.Services.ILanguageService;

import java.util.List;

@Service
public class LanguageImplements implements ILanguageService {
    @Autowired
    private LanguagesRepository lR;

    @Override
    public void insert(Languages languages) {
        lR.save(languages);
    }

    @Override
    public List<Languages> list() {
        return lR.findAll();
    }

    @Override
    public void delete(int Id) {
        lR.deleteById(Id);
    }
}
