import java.util.NoSuchElementException;

// Ein 'FilterMultiples'-Objekt erzeugt aus einer Datenquelle 'source' eine gefilterte Zahlenfolge.
// Alle Zahlen, die durch 'div' teilbar sind, sind nicht Teil der gefilterten Folge.
// Alle übrigen Zahlen von 'source' sind Teil der gefilterten Folge.
// hasNext() und next() beziehen sich auf die gefilterte Folge.
class FilterMultiples implements FilteredGenerator {
    //TODO: Fehlende Teile der Klasse implementieren
    private Generator source;
    private int div;
    private boolean exists;
    private int next;

    public FilterMultiples(Generator source, int div) {
        this.source = source;
        this.div = div;
    }

    @Override
    public boolean pass(int i) {
        return i % div != 0;
    }

    @Override
    public FilteredGenerator copy() {
        return new FilterMultiples(source.copy(), div);
    }

    @Override
    public boolean hasNext() {
        while (source.hasNext() && !exists){
            next = source.next();
            if(pass(next)){
                exists = true;
            }
        }
        return exists;
    }

    @Override
    public Integer next() {
        if(hasNext()){
            exists = false;
            return next;
        }else{
            throw new NoSuchElementException(this.getClass().getSimpleName() + " has no more numbers!");
        }
    }
}
