package stepik.typeconversion;

public class Conversion {

    public static void main(String[] args) {
        System.out.println(charExpression(32)); // |
        System.out.println(charExpression(29)); // y
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

}
