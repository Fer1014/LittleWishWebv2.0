package pe.edu.upc.aaw.littlewishweb.Entities;

import javax.persistence.*;

@Entity
@Table(name = "points")
public class Points {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "points", nullable = false)
    private int points;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users user;

    public Points() {
    }

    public Points(int id, int points, Users user) {
        Id = id;
        this.points = points;
        this.user = user;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
