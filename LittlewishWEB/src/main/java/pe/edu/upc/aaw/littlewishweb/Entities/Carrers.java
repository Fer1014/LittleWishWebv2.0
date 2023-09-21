package pe.edu.upc.aaw.littlewishweb.Entities;

import javax.persistence.*;

@Entity
@Table(name = "carrers")
public class Carrers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "name", length = 45, nullable = false)
    private String name;

    public Carrers() {
    }

    public Carrers(int id, String name) {
        Id = id;
        this.name = name;
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
}
