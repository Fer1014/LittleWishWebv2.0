package pe.edu.upc.aaw.littlewishweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishweb.Entities.Languages;

@Repository
public interface LanguagesRepository extends JpaRepository<Languages, Integer> {
}
