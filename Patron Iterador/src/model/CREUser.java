package model;

public class CREUser {
    private int id;
    private UserData userData;

    public CREUser(int id, UserData userData) {
        this.id = id;
        this.userData = userData;
    }

    public int getId() { return id; }
    public UserData getUserData() { return userData; }
}
