package model;

public class GoogleUser {
    private String name;
    private String email;

    public GoogleUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}
