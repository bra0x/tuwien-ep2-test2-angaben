import java.util.Objects;

// 'NonEmpty' repräsentiert eine aufsteigend iterierbare Menge von aufeinander folgenden ganzen Zahlen,
// die mindestens eine Zahl enthält. 'NonEmpty' wird durch Untergrenze 'lower' und Obergenze 'upper'
// des Intervalls bestimmt.
class NonEmpty implements Interval, Iterable {

    //TODO: Klasse implementieren
    private int lower;
    private int upper;

    public NonEmpty(int lower, int upper) {
        if (upper < lower) {
            throw new IllegalArgumentException("lower (" + lower + ") must not be greater than upper (" + upper + ")!");
        } else {
            this.lower = lower;
            this.upper = upper;
        }
    }

    @Override
    public boolean contains(Integer n) {
        return n >= lower && n <= upper;
    }

    @Override
    public boolean containsAll(Interval iv) {
        if(iv.isEmpty()){
            return false;
        }else{
            boolean out = true;
            for(int i : iv){
                if(!contains(i)){
                    out = false;
                }
            }

            return out;
        }
    }

    @Override
    public Interval intersect(Interval iv) {
        if(iv.isEmpty()){
            return Empty.EMPTY;
        }else if(!iv.contains(lower) && !iv.contains(upper) && !containsAll(iv)){
            return Empty.EMPTY;
        }else{
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i : iv){
                if(contains(i)){
                   if(min > i) {
                       min = i;
                   }
                   if(max < i){
                       max = i;
                   }
                }
            }

            return new NonEmpty(min,max);
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new NonEmptyIterator(lower,upper);
    }

    @Override
    public String toString() {
        return "["+ lower + ", " + upper + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonEmpty that = (NonEmpty) o;

        return this.lower == that.lower && this.upper == that.upper;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lower,upper);
    }
}
