package javarush.set;

import java.util.HashSet;
import java.util.Set;

/*
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> sets = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            sets.add("Любовь"+i);
        }
        return sets;
    }

    public static void main(String[] args) {
        System.out.println(createSet().size());
    }
}