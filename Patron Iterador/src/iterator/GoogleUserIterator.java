package iterator;

import model.GoogleUser;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GoogleUserIterator implements Iterator<SocialUser> {
    private GoogleUser[] users;
    private int index = 0;

    public GoogleUserIterator(GoogleUser[] users) {
        this.users = users;
    }

    public boolean hasNext() {
        return index < users.length;
    }

    public SocialUser next() {
        if (!hasNext()) throw new NoSuchElementException();
        return new GoogleUserAdapter(users[index++]);
    }
}
