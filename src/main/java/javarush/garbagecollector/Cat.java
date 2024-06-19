package javarush.garbagecollector;

public class Cat {

    private String name;
    static int count = 0;

    public Cat(String name) {
        this.name = name;
        count++;
        System.out.println(count);
    }

    public Cat() {
    }

    public static void main(String[] args) throws Throwable {

        for (int i = 0 ; i < 1000000; i++) {

            Cat cat = new Cat();
            cat = null;//вот здесь первый объект становится доступен сборщику мусора
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Объект Cat уничтожен!" + (count--));
    }
}