import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CSIterator implements OrbitIterator{
    private Iterator<Orbitable> it;

    public CSIterator(ArrayList<Orbitable> al){
        it = al.iterator();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public Orbitable next() {
        if(!hasNext()) {
            throw new NoSuchElementException("ERROR!");
        }else{
            return it.next();
        }
    }
}
