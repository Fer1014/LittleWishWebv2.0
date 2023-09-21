package pe.edu.upc.aaw.littlewishweb.Dtos;

import pe.edu.upc.aaw.littlewishweb.Entities.Carrers;
import pe.edu.upc.aaw.littlewishweb.Entities.Universities;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class EducationProfileDTO {
    private int Id;

    private String highschoolname;

    private Universities universities;

    private Carrers carrers;

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
