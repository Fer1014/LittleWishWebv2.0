package pe.edu.upc.aaw.littlewishweb.Dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class UniversitiesDTO {
    private int Id;

    private String name;

    private LocalDate startdate;

    private LocalDate enddate;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }
}
