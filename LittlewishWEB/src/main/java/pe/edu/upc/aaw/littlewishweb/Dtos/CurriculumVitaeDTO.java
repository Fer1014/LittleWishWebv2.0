package pe.edu.upc.aaw.littlewishweb.Dtos;

import pe.edu.upc.aaw.littlewishweb.Entities.Certifications;
import pe.edu.upc.aaw.littlewishweb.Entities.EducationProfile;
import pe.edu.upc.aaw.littlewishweb.Entities.Languages;
import pe.edu.upc.aaw.littlewishweb.Entities.WorkExperience;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CurriculumVitaeDTO {
    private int Id;
    private Languages languages;

    private Certifications certifications;

    private WorkExperience workExperience;

    private EducationProfile educationProfile;

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
