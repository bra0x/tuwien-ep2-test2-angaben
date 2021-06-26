import java.util.*;

// This class implements 'StringOperator' and represents a composition of two 'StringOperator'
// objects that are applied in succession (both can be 'ComposedOperator' objects themselves).
// Calling this object's 'apply' method returns the result of applying the second 'StringOperator'
// on the result of applying the first one on the specified string.
// 'ComposedOperator' objects can be build using the 'andThen' method specified in the
// interface 'StringOperator'.
//
public class ComposedOperator implements StringOperator {
    private StringOperator first;
    private StringOperator second;

    public ComposedOperator(StringOperator first, StringOperator second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String apply(String operand) {
        String out = first.apply(operand);
        out = second.apply(out);

        return out;
    }

    @Override
    public StringOperator andThen(StringOperator after) {
        return new ComposedOperator(this, after);
    }

    @Override
    public Iterator<StringOperator> iterator() {
        return new COIterator(first.iterator(),second.iterator());
    }

    @Override
    public String toString() {
        return first + " and then " + second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComposedOperator that = (ComposedOperator) o;

        return first.equals(that.first) && second.equals(that.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    //TODO: define missing parts of this class.

}