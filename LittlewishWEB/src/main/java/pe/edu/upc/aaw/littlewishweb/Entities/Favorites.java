package pe.edu.upc.aaw.littlewishweb.Entities;

import javax.persistence.*;

@Entity
@Table(name = "favorites")
public class Favorites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users user;

    public Favorites() {
    }

    public Favorites(int id, Users user) {
        Id = id;
        this.user = user;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
