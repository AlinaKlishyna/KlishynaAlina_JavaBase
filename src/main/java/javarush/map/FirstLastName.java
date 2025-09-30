package javarush.map;

import java.util.HashMap;
import java.util.Map;

public class FirstLastName {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Alina","Lysiak");
        map.put("Alin","Borozhok");
        map.put("Vladyslav","Lysiak");
        map.put("Bob","Klishyn");
        map.put("Francesco","Klishyn");
        map.put("Vova","Lysiak");
        map.put("Lokky","Borozhok");
        map.put("Stanislav","Lysiak");
        map.put("Jenya","Klishyn");
        map.put("Ramil","Klishyn");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> people : map.entrySet()) {
            if (people.getKey().equalsIgnoreCase(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> people : map.entrySet()) {
            if (people.getValue().equalsIgnoreCase(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println(getCountTheSameFirstName(createMap(), "Alina"));
        System.out.println(getCountTheSameLastName(createMap(), "Klishyn"));
    }
}
