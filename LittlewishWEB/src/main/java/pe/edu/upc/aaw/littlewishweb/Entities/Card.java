package pe.edu.upc.aaw.littlewishweb.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "cardnumber", length = 16, nullable = false)
    private int cardnumber;
    @Column(name = "expdate", nullable = false)
    private Date expdate;
    @Column(name = "name",length = 20, nullable = false)
    private String name;
    @Column(name = "lastname", length = 30, nullable = false)
    private String lastname;
    @Column(name = "cvv", length = 3,nullable = false)
    private int cvv;

    public Card() {
    }

    public Card(int id, int cardnumber, Date expdate, String name, String lastname, int cvv) {
        Id = id;
        this.cardnumber = cardnumber;
        this.expdate = expdate;
        this.name = name;
        this.lastname = lastname;
        this.cvv = cvv;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
