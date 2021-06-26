// Eine Summe mit linkem und rechtem Summanden. Der Iterator iteriert über alle Zahlen des Ausdrucks von links nach rechts.
class Sum implements Expression {

    private Expression right;
    private Expression left;

    // Konstruktor
    public Sum(Expression right, Expression left) {
        this.right = right;
        this.left = left;
    }

    public Sum add(Expression exp) {
        return new Sum(this, exp);
    }

    public int eval() {
        return right.eval() + left.eval();
    }

    public Iterator iterator() {
        return new SumIterator(right.iterator(), left.iterator());
    }

    public String toString() {
        if (left.getClass() == Number.class && left.eval() < 0) {
            return right.toString() + left;
        }else{
            return right + "+" +left;
        }
    }
}
