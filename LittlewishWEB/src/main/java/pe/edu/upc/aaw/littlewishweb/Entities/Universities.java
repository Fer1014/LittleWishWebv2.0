package pe.edu.upc.aaw.littlewishweb.Entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "universities")
public class Universities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "name", length = 45, nullable = false)
    private String name;
    @Column(name = "startdate", nullable = false)
    private LocalDate startdate;
    @Column(name = "enddate",nullable = false)
    private LocalDate enddate;

    public Universities() {
    }

    public Universities(int id, String name, LocalDate startdate, LocalDate enddate) {
        Id = id;
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
    }

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
