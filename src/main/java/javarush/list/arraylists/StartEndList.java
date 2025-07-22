package javarush.list.arraylists;

import java.util.ArrayList;
import java.util.LinkedList;

public class StartEndList {
    public static void main(String[] args) {
        //funcArrayList();
        funcLinkedList();
    }

    public static void funcArrayList() {
        ArrayList<String> line = new ArrayList<>();
        line.add("1-ый");
        line.add("2-ой"); //добавляется в конец списка
        System.out.println(line);  // вывод: [1-ый, 2-ой]
    }

    public static void funcLinkedList() {
        LinkedList<String> line = new LinkedList<>();
        line.add("1-ый");
        line.add("2-ой"); //добавляется в конец списка
        System.out.println(line);  // вывод: [1-ый, 2-ой]
    }
}
