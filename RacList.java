public class RacList<T> {
    private final T left;
    private final RacList right;

    public RacList(T left, RacList right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public RacList getRight() {
        return right;
    }

    @Override
    public String toString() {
        String str = "(" + left.toString();
        if(right == null)
            return str + ")";
        return str + ", " + right.rightString();


    }

    public String rightString() {
        String str = left.toString();
        if(right == null)
            return str + ")";
        return str + ", " + right.rightString();
    }
}
