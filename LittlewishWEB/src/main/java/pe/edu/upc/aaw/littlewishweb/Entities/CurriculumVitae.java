package pe.edu.upc.aaw.littlewishweb.Entities;

import org.springframework.security.core.authority.mapping.NullAuthoritiesMapper;

import javax.persistence.*;

@Entity
@Table(name = "curriculumvitae")
public class CurriculumVitae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcv")
    private int Id;
    @ManyToOne
    @JoinColumn(name = "idlanguages")
    private Languages languages;
    @ManyToOne
    @JoinColumn(name = "idcertifications")
    private Certifications certifications;
    @ManyToOne
    @JoinColumn(name = "idwworkexperience")
    private WorkExperience workExperience;
    @ManyToOne
    @JoinColumn(name = "ideducationprofile")
    private EducationProfile educationProfile;

    public CurriculumVitae() {
    }

    public CurriculumVitae(int id, Languages languages, Certifications certifications, WorkExperience workExperience, EducationProfile educationProfile) {
        Id = id;
        this.languages = languages;
        this.certifications = certifications;
        this.workExperience = workExperience;
        this.educationProfile = educationProfile;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public Certifications getCertifications() {
        return certifications;
    }

    public void setCertifications(Certifications certifications) {
        this.certifications = certifications;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public EducationProfile getEducationProfile() {
        return educationProfile;
    }

    public void setEducationProfile(EducationProfile educationProfile) {
        this.educationProfile = educationProfile;
    }
}
