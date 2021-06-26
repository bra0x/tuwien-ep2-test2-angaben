import java.util.*;

// 'Constant' implements 'Polynomial' and is used by class 'HornerScheme' to represent a polynomial
// with degree 0. Its value is a*x⁰ = a (regardless of the 'x' used for evaluation).
// The iterator of this class iterates over only one value and therefore behaves as follows:
// The 'next' method returns the value of 'this' (specified by 'a'), if it is called for the first
// time. 'hasNext' is 'true' only if 'next' has not been called.
//
public class Constant implements Polynomial{

    //TODO: define missing parts of this class.
    private int a;

    // Initializes this object.
    // Precondition: a != 0.
    public Constant(int a) {

        //TODO: implement constructor.
        this.a = a;

    }

    @Override
    public int degree() {
        return 0;
    }

    @Override
    public List<Integer> coefficients() {
        List<Integer> out = new ArrayList<>();
        out.add(a);

        return out;
    }

    @Override
    public double eval(double x) {
        return a;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ConstantIterator(a);
    }

    @Override
    public String toString() {
        return String.valueOf(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constant integers = (Constant) o;
        
        return a == integers.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}


