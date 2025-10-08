package javarush.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateLastName {
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
        map.put("Ramil","Fdd");
        return map;
    }

    public static void removeTheLastNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Set<String> unique = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (Map.Entry<String, String> item : map.entrySet()) {
            if (!unique.add(item.getValue())) {
                duplicate.add(item.getValue());
            }
        }

        for (String lastname : duplicate) {
            removeItemFromMapByValue(map, lastname);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(map);
        System.out.println("size: " + map.size());

        removeTheLastNameDuplicates(map);
        System.out.println(map);
        System.out.println("size: " + map.size());
    }
}
