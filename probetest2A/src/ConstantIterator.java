import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConstantIterator implements Iterator<Integer> {
    private int a;
    private boolean used = false;

    public ConstantIterator(int a){
        this.a = a;
    }

    @Override
    public boolean hasNext() {
        return !used;
    }

    @Override
    public Integer next() {
        if(used){
            throw new NoSuchElementException("ERROR!");
        }else{
            used = true;
            return a;
        }
    }
}
