import java.util.Iterator;
import java.util.NoSuchElementException;

public class HSIterator implements Iterator<Integer> {
    private Iterator<Integer> sub;
    private int a;
    private boolean used = false;

    public HSIterator(Iterator<Integer> it, int a){
        this.sub = it;
        this.a = a;
    }

    @Override
    public boolean hasNext() {
        return !used || sub.hasNext();
    }

    @Override
    public Integer next() {
        if(!used){
            used = true;
            return a;
        }else if(sub.hasNext()){
            return sub.next();
        }else{
            throw new NoSuchElementException("ERROR!");
        }
    }
}
