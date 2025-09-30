package javarush.set;

import java.util.HashSet;
import java.util.Set;

public class NumberGreaterTen {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        for (int i = -50; i < 50; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(num -> num>10);
        return set;
    }

    public static void main(String[] args) {
        System.out.println(createSet().size());
        System.out.println(removeAllNumbersGreaterThan10(createSet()).size());
    }
}
