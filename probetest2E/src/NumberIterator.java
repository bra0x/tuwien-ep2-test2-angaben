import java.util.NoSuchElementException;

public class NumberIterator implements Iterator{
    private int num;
    private boolean used = false;

    public NumberIterator(int num){
        this.num = num;
    }

    @Override
    public boolean hasNext() {
        return !used;
    }

    @Override
    public Integer next() {
        if(used){
            throw new NoSuchElementException("No more numbers!");
        }
        used = true;
        return num;
    }
}
