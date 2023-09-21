package pe.edu.upc.aaw.littlewishweb.Dtos;

import javax.persistence.Column;

public class LanguagesDTO {
    private int Id;

    private String language;

    private String writinglevel;

    private String speakinglevel;

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
