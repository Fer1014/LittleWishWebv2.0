package pe.edu.upc.aaw.littlewishweb.Entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "workexperience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "companyname",length = 45,nullable = false)
    private String companyname;
    @Column(name = "jobposition",length = 45,nullable = false)
    private String jobposition;
    @Column(name = "startdate",nullable = false)
    private LocalDate startdate;
    @Column(name = "enddate",nullable = false)
    private LocalDate enddate;

    public WorkExperience() {
    }

    public WorkExperience(int id, String companyname, String jobposition, LocalDate startdate, LocalDate enddate) {
        Id = id;
        this.companyname = companyname;
        this.jobposition = jobposition;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getJobposition() {
        return jobposition;
    }

    public void setJobposition(String jobposition) {
        this.jobposition = jobposition;
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
