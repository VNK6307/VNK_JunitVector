package junit.vector;

public class Vector {
    private double x;
    private double y;


    public double length() {
        return Math.sqrt(x * x + y * y);
    }
}// class
