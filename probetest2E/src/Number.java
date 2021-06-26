// Diese Klasse repräsentiert eine ganze Zahl. Ihr Iterator liefert nur eine Zahl und ist danach verbraucht.
class Number implements Expression {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int eval() {
        return num;
    }

    public Sum add(Expression exp) {
        return new Sum(this, exp);
    }

    public String toString() {
        return Integer.toString(num);
    }

    public Iterator iterator() {
        return new NumberIterator(num);
    }
}
