import java.util.Iterator;
import java.util.NoSuchElementException;

public class COIterator implements Iterator<StringOperator> {
    private Iterator<StringOperator> first, second;
    boolean firstUsed = false;

    public COIterator(Iterator<StringOperator> first, Iterator<StringOperator> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean hasNext() {
        return !firstUsed || second.hasNext();
    }

    @Override
    public StringOperator next() {
        if (!hasNext()) {
            throw new NoSuchElementException("ERROR!");
        }

        StringOperator out;
        if (!firstUsed) {
            out = first.next();
            if (!first.hasNext()) {
                firstUsed = true;
            }
        } else {
            return second.next();
        }
        return out;
    }
}
