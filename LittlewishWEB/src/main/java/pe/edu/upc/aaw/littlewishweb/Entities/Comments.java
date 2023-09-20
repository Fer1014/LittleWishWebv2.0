package pe.edu.upc.aaw.littlewishweb.Entities;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "comment",length = 45, nullable = false)
    private String comment;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users user;

    public Comments() {
    }

    public Comments(int id, String comment, Users user) {
        Id = id;
        this.comment = comment;
        this.user = user;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
