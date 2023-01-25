package junit.vector;

public class SquareRoot {
    public double a;

    public double calcSquareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Argument should be positive.");
        }
        return Math.sqrt(a);
    }
}
