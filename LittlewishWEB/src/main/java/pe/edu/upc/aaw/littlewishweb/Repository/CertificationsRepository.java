package pe.edu.upc.aaw.littlewishweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishweb.Entities.Certifications;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface CertificationsRepository extends JpaRepository<Certifications, Integer> {
}
