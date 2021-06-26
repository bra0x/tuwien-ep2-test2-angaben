// 'Empty' repräsentiert die leere Menge.
class Empty implements Interval, Iterable {

    // Öffentliches Objekt zur Repräsentation der leeren Menge.
    public static final Empty EMPTY = new Empty();

    // Konstruktor (wird nur von 'Empty' genutzt)
    private Empty() {
    }

    @Override
    public boolean contains(Integer n) {
        return false;
    }

    @Override
    public boolean containsAll(Interval iv) {
        return false;
    }

    @Override
    public Interval intersect(Interval iv) {
        return this;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Iterator iterator() {
        return new EmptyIterator();
    }

    @Override
    public String toString() {
        return "[]";
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
