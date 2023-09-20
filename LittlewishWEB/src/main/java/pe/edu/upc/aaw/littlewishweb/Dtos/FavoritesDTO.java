package pe.edu.upc.aaw.littlewishweb.Dtos;

import pe.edu.upc.aaw.littlewishweb.Entities.Users;

public class FavoritesDTO {
    private int Id;
    private Users user;

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
