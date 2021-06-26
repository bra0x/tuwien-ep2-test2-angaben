import java.util.NoSuchElementException;

public class SumIterator implements Iterator{

    private Iterator right;
    private Iterator left;
    private boolean rightUsed = false;

    public SumIterator(Iterator right, Iterator left){
        this.right = right;
        this.left = left;
    }

    @Override
    public boolean hasNext() {
        return !rightUsed || left.hasNext();
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            throw new NoSuchElementException("No more numbers!");
        }

        int out;
        if(!rightUsed){
            out = right.next();
            if(!right.hasNext()){
                rightUsed = true;
            }
        }else{
            out = left.next();
        }
        return out;
    }
}
