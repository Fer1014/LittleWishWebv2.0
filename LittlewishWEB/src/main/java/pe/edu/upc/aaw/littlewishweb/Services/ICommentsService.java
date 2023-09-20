package pe.edu.upc.aaw.littlewishweb.Services;

import pe.edu.upc.aaw.littlewishweb.Entities.Comments;

import java.util.List;

public interface ICommentsService {
    void insert(Comments comments);
    public List<Comments> list();
    public void delete(int Id);
}
