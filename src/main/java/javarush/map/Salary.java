package javarush.map;

import java.util.HashMap;
import java.util.Map;

public class Salary {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put("Klishyna" + i, i*100);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(item -> item.getValue()<500);
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        for (Map.Entry<String, Integer> item : map.entrySet())  {
            System.out.println(item);
        }

        System.out.println("---------------");
        removeItemFromMap(map);
        for (Map.Entry<String, Integer> item : map.entrySet())  {
            System.out.println(item);
        }
    }
}
