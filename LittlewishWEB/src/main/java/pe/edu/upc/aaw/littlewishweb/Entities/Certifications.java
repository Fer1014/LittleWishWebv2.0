package pe.edu.upc.aaw.littlewishweb.Entities;

import net.bytebuddy.asm.Advice;
import org.springframework.security.core.authority.mapping.NullAuthoritiesMapper;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Certifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "cenrticationname",length = 45,nullable = false)
    private String certificationname;
    @Column(name = "issuingcompany", length = 45, nullable = false)
    private String issuingcompany;
    @Column(name = "issuedate",nullable = false)
    private LocalDate issuedate;
    @Column(name = "expirationdate",nullable = false)
    private LocalDate expirationdate;
    @Column(name = "urlcredential",nullable = false)
    private String urlcredential;

    public Certifications() {
    }

    public Certifications(int id, String certificationname, String issuingcompany, LocalDate issuedate, LocalDate expirationdate, String urlcredential) {
        Id = id;
        this.certificationname = certificationname;
        this.issuingcompany = issuingcompany;
        this.issuedate = issuedate;
        this.expirationdate = expirationdate;
        this.urlcredential = urlcredential;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCertificationname() {
        return certificationname;
    }

    public void setCertificationname(String certificationname) {
        this.certificationname = certificationname;
    }

    public String getIssuingcompany() {
        return issuingcompany;
    }

    public void setIssuingcompany(String issuingcompany) {
        this.issuingcompany = issuingcompany;
    }

    public LocalDate getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(LocalDate issuedate) {
        this.issuedate = issuedate;
    }

    public LocalDate getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(LocalDate expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getUrlcredential() {
        return urlcredential;
    }

    public void setUrlcredential(String urlcredential) {
        this.urlcredential = urlcredential;
    }
}
