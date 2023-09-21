package pe.edu.upc.aaw.littlewishweb.Entities;

import org.springframework.security.core.authority.mapping.NullAuthoritiesMapper;

import javax.persistence.*;

@Entity
@Table(name = "educationprofile")
public class EducationProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "highschoolname", length = 45, nullable = false)
    private String highschoolname;
    @ManyToOne
    @JoinColumn(name = "id_universities")
    private Universities universities;
    @ManyToOne
    @JoinColumn(name = "id_carrers")
    private Carrers carrers;

    public EducationProfile() {
    }

    public EducationProfile(int id, String highschoolname, Universities universities, Carrers carrers) {
        Id = id;
        this.highschoolname = highschoolname;
        this.universities = universities;
        this.carrers = carrers;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getHighschoolname() {
        return highschoolname;
    }

    public void setHighschoolname(String highschoolname) {
        this.highschoolname = highschoolname;
    }

    public Universities getUniversities() {
        return universities;
    }

    public void setUniversities(Universities universities) {
        this.universities = universities;
    }

    public Carrers getCarrers() {
        return carrers;
    }

    public void setCarrers(Carrers carrers) {
        this.carrers = carrers;
    }
}
