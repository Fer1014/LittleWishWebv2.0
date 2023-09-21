package pe.edu.upc.aaw.littlewishweb.Entities;

import javax.persistence.*;


@Entity
@Table(name = "languages")
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "language", length = 45, nullable = false)
    private String language;
    @Column(name = "writinglevel", nullable = false)
    private String writinglevel;
    @Column(name = "speakinglevel", nullable = false)
    private String speakinglevel;

    public Languages() {
    }

    public Languages(int id, String language, String writinglevel, String speakinglevel) {
        Id = id;
        this.language = language;
        this.writinglevel = writinglevel;
        this.speakinglevel = speakinglevel;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getWritinglevel() {
        return writinglevel;
    }

    public void setWritinglevel(String writinglevel) {
        this.writinglevel = writinglevel;
    }

    public String getSpeakinglevel() {
        return speakinglevel;
    }

    public void setSpeakinglevel(String speakinglevel) {
        this.speakinglevel = speakinglevel;
    }
}
