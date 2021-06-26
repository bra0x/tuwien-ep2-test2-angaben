import java.util.NoSuchElementException;

public class CBIterator implements OrbitIterator{
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Orbitable next() {
        throw new NoSuchElementException("ERROR!");
    }
}
