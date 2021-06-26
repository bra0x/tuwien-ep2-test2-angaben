import java.util.NoSuchElementException;

public class EmptyIterator implements Iterator {

    public EmptyIterator(){}

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        throw new NoSuchElementException("EMPTY has no elements!");
    }
}
