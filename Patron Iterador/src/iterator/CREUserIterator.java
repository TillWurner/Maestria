package iterator;

import model.UserData;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class CREUserIterator implements Iterator<SocialUser> {
    private Iterator<UserData> iterator;

    public CREUserIterator(Map<Integer, UserData> userMap) {
        this.iterator = userMap.values().iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public SocialUser next() {
        if (!hasNext()) throw new NoSuchElementException();
        return new CREUserAdapter(iterator.next());
    }
}
