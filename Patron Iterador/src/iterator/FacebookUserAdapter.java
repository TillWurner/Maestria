package iterator;

import model.FacebookUser;

public class FacebookUserAdapter implements SocialUser {
    private FacebookUser user;

    public FacebookUserAdapter(FacebookUser user) {
        this.user = user;
    }

    public String getName() {
        return user.getFbName();
    }

    public String getContactInfo() {
        return user.getFbUrl();
    }
}
