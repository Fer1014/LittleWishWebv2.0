package pe.edu.upc.aaw.littlewishweb.Dtos;

import pe.edu.upc.aaw.littlewishweb.Entities.Users;

public class PointsDTO {
    private int Id;
    private int points;
    private Users user;

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
