package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;

import java.util.List;

public interface ICarrersService {
    public void insert(Carrers carrers);
    public List<Carrers> list();
    public void delete(int Id);
}
