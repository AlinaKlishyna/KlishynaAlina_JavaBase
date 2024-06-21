package javarush.statics;

import java.util.ArrayList;

public class CatArrayStatic {
    //напишите тут ваш код
    public static ArrayList<CatArrayStatic> cats = new ArrayList<>();
    private String name;

    public CatArrayStatic(String name) {
        this.name = name;
        cats.add(this);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for(CatArrayStatic item : cats) {
            System.out.println(item);
        }
    }
}
