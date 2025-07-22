package javarush.list.arraylists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
10 тысяч удалений и вставок
*/

public class ArrayLinkedList1000 {
    
    public static void main(String[] args) {
        int x = 0;
        if (x == x++) {
        }
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        if (list.isEmpty())
            return;
        int value = list.size()/2;
        for (int i = 0; i<10000; i++) {
            list.add(value);
        }
    }

    public static void get10000(List list) {
        //напишите тут ваш код

    }

    public static void set10000(List list) {
        //напишите тут ваш код

    }

    public static void remove10000(List list) {
        //напишите тут ваш код

    }
}
