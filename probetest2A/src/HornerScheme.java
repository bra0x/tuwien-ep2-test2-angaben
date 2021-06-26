import java.util.*;

// The class implements 'Polynomial' and represents the form (a + x*p), where 'a' is an Integer
// and 'p' is another polynomial. 'p' must not be 'null' (objects of 'Constant' shall be used to represent constants).
// This class implements 'Polynomial' by using Horner's scheme.
// Example:
// a₀ + a₁*x + a₂*x² + a₃*x³ + a₄*x⁴
// The polynomial above is represented in Horner's scheme as:
// a₀ + x*(a₁ + x*(a₂ + x*(a₃ + x*a₄)))
//
public class HornerScheme implements Polynomial {

    //TODO: define missing parts of this class.
    private int a;
    private Polynomial p;

    // Initializes this object.
    // Precondition: 'p' must not be 'null'.
    public HornerScheme(int a, Polynomial p) {
        //TODO: implement this constructor.
        this.a = a;
        this.p = p;
    }

    // Creates a polynomial from the coefficients specified by the array coeffs = {a₀, a₁, a₂, ... a𝘥}.
    // Precondition: coeffs != null and coeffs has at least one element.
    public static Polynomial create(int[] coeffs) {
        //TODO: implement this method.
        if(coeffs.length == 1){
            return new Constant(coeffs[0]);
        }

        Polynomial pol = new HornerScheme(coeffs[coeffs.length-2], new Constant(coeffs[coeffs.length-1]));
        for(int i = coeffs.length-3; i >= 0; i--){
            pol = new HornerScheme(coeffs[i], pol);
        }
        return pol;
    }

    @Override
    public int degree() {
        return this.coefficients().size() - 1;
    }

    @Override
    public List<Integer> coefficients() {
        List<Integer> list = new ArrayList<>();
        for(int a : this){
            list.add(a);
        }

        return list;
    }

    @Override
    public double eval(double x) {
        return a + x * p.eval(x);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new HSIterator(p.iterator(),a);
    }

    @Override
    public String toString() {
        return "(" + a + " + x*" + p + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HornerScheme integers = (HornerScheme) o;

        return a == integers.a && p.equals(integers.p);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, p);
    }
}



