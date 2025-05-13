package iterator;

import model.FacebookUser;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FacebookUserIterator implements Iterator<SocialUser> {
    private Iterator<FacebookUser> iterator;

    public FacebookUserIterator(List<FacebookUser> users) {
        this.iterator = users.iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public SocialUser next() {
        if (!hasNext()) throw new NoSuchElementException();
        return new FacebookUserAdapter(iterator.next());
    }
}
