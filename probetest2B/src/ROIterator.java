import java.util.Iterator;
import java.util.NoSuchElementException;

public class ROIterator implements Iterator<StringOperator> {
    private StringOperator so;
    private boolean used = false;

    public ROIterator(StringOperator so){
        this.so = so;
    }

    @Override
    public boolean hasNext() {
        return !used;
    }

    @Override
    public StringOperator next() {
        if(!used){
            used = true;
            return so;
        }else{
            throw new NoSuchElementException("ERROR!");
        }
    }
}
