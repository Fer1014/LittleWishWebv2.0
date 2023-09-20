package pe.edu.upc.aaw.littlewishweb.Dtos;

import pe.edu.upc.aaw.littlewishweb.Entities.Users;

public class CommentsDTO {
    private int Id;
    private String comment;
    private Users user;

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
