package stepik.primitivetipes;

public class EqualBoolean {

    public static void main(String[] args) {
        System.out.println(doubleExpression(1.0,1.0,2.0));
    }

    //погрешность при сравнении типа double
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 0.0001;
    }

}
