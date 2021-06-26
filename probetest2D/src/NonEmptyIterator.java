import java.util.NoSuchElementException;

public class NonEmptyIterator implements Iterator{
    int cursor;
    int upper;

    public NonEmptyIterator(int lower, int upper){
        this.cursor = lower;
        this.upper = upper;
    }

    @Override
    public boolean hasNext() {
        return cursor <= upper;
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            throw new NoSuchElementException("ERROR!");
        }else{
            return cursor++;
        }
    }
}
