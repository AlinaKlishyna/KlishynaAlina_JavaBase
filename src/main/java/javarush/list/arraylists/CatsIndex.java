package javarush.list.arraylists;

import java.util.ArrayList;

public class CatsIndex {
    public static void main(String[] args) {
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Барсик"); //индекс 0
        cats.add("Фоксик");  //индекс 1
        cats.add("Толик"); //индекс 2
        cats.add("Геральт из Ривии"); //индекс 3
        System.out.println(cats);
        cats.remove(3);
        System.out.println(cats);

    }
}
