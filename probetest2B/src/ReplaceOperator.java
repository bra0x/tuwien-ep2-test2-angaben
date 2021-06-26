import java.util.*;

// This class implements 'StringOperator' and represents a simple replacement operation on a string.
// It replaces the all occurrences of the specified 'oldChar' with 'newChar'.
// The iterator of this class iterates over only one element and therefore behaves as follows:
// The 'next' method returns 'this', if it is called for the first time.
// 'hasNext' is 'true' only if 'next' has not been called.
//
public class ReplaceOperator implements StringOperator {

    //TODO: define variables.
    private char oldChar, newChar;

    // Constructor of the 'ReplaceOperator'.
    public ReplaceOperator(char oldChar, char newChar) {

        //TODO: implement constructor.
        this.oldChar = oldChar;
        this.newChar = newChar;

    }

    @Override
    public String apply(String operand) {
        return operand.replace(oldChar,newChar);
    }

    @Override
    public StringOperator andThen(StringOperator after) {
        return new ComposedOperator(this, after);
    }

    @Override
    public Iterator<StringOperator> iterator() {
        return new ROIterator(this);
    }

    @Override
    public String toString() {
        return "replace '" + oldChar + "' with '" + newChar + "'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReplaceOperator that = (ReplaceOperator) o;

        return oldChar == that.oldChar && newChar == that.newChar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldChar, newChar);
    }

    //TODO: define missing parts of this class.
}
