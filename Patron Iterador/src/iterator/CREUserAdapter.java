package iterator;

import model.UserData;

public class CREUserAdapter implements SocialUser {
    private UserData user;

    public CREUserAdapter(UserData user) {
        this.user = user;
    }

    public String getName() {
        return user.getName();
    }

    public String getContactInfo() {
        return "Dirección: " + user.getAddress() + ", Monto a pagar: $" + user.getPayment();
    }
}
