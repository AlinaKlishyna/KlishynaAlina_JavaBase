package stepik.exception.sqrt;

public class Run {
    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }

    public static double sqrt(double x) {
        if (x < 0)
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        return Math.sqrt(x);
    }

}
