package stepik.extend;

public class Car {
    private final Color brand;

    public Car(Color brand) {
        this.brand = brand;
    }

    public Color getBrand() {
        return brand;
    }

    public static double getAge() {
     return Math.random()+5;
    }

    public static void main(String[] args) {
        System.out.println(getAge());;
    }
}
