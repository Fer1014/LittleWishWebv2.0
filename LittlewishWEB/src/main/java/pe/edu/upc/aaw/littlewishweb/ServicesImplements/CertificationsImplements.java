package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.Certifications;
import pe.edu.upc.aaw.littlewishweb.Repository.CertificationsRepository;
import pe.edu.upc.aaw.littlewishweb.Services.ICertificationsService;

import java.util.List;

@Service
public class CertificationsImplements implements ICertificationsService {
    @Autowired
    private CertificationsRepository cR;

    @Override
    public void insert(Certifications certifications) {
        cR.save(certifications);
    }

    @Override
    public List<Certifications> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int Id) {
        cR.deleteById(Id);
    }
}
