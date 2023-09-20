package pe.edu.upc.aaw.littlewishweb.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishweb.Entities.Comments;
import pe.edu.upc.aaw.littlewishweb.Repository.CommentsRepository;
import pe.edu.upc.aaw.littlewishweb.Services.ICommentsService;

import java.util.List;

@Service
public class CommentsServiceImplements implements ICommentsService {
    @Autowired
    private CommentsRepository cS;

    @Override
    public void insert(Comments comments) {
        cS.save(comments);

    }

    @Override
    public List<Comments> list() {
        return cS.findAll();
    }

    @Override
    public void delete(int Id) {
        cS.deleteById(Id);

    }
}
