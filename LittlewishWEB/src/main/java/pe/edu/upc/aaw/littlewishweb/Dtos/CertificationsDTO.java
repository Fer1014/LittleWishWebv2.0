package pe.edu.upc.aaw.littlewishweb.Dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class CertificationsDTO {
    private int Id;
    private String certificationname;

    private String issuingcompany;

    private LocalDate issuedate;

    private LocalDate expirationdate;

    private String urlcredential;

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
