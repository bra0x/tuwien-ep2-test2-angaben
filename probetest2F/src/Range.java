import java.util.NoSuchElementException;

// 'Range' ist ein Generator der aufsteigenden Folge von aufeinander folgenden ganzen Zahlen im
// bestimmten Intervall von 'first' bis 'last' (inklusive).
// Der Generator liefert nur dann mindestens eine Zahl, wenn gilt first <= last,
// sonst liefert er keine Zahl.
class Range implements Generator {
    private int first;
    private int last;
    private int cursor;

    public Range(int first, int last) {
        if(first > last){
            throw new IllegalArgumentException("First can't be bigger than last");
        }else{
            this.first = first;
            this.last = last;
            this.cursor = first;
        }
    }

    @Override
    public boolean hasNext() {
        return cursor <= last;
    }

    public Integer next() {
        if(hasNext()){
            return cursor++;
        }else{
            throw new NoSuchElementException(this.getClass().getSimpleName() + " has no more numbers!");
        }

    }

    @Override
    public Generator copy() {
        Range out = new Range(first,last);
        out.cursor = this.cursor;
        return out;
    }
}
