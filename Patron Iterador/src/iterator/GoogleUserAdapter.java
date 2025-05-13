package iterator;

import model.GoogleUser;

public class GoogleUserAdapter implements SocialUser {
    private GoogleUser user;

    public GoogleUserAdapter(GoogleUser user) {
        this.user = user;
    }

    public String getName() {
        return user.getName();
    }

    public String getContactInfo() {
        return user.getEmail();
    }
}
