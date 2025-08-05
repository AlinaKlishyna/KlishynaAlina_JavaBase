package com.gmail.alinakotova102.corsoRanstad.OOP.stream;

import com.gmail.alinakotova102.corsoRanstad.polimorfismo.overloade.sezione3.Matematica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static boolean isEven(int[] numbers) {
        // does not work with primitives, so we transfer it to a collection
        return Arrays.stream(numbers).allMatch(
                n -> n % 2 == 0
        );
    }

    public static List filterLength(String[] texts) {
        return Arrays.stream(texts).filter(n -> n.length() >= 5).toList();
    }

    public static int addAndSum(List<Integer> numbers, List<Integer> other) {
        return Stream.concat(numbers.stream(), other.stream()).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum();
    }

    public static List<String> sorAlphabet(String[] texts) {
        return Arrays.stream(texts).sorted().toList();
    }

    public static boolean checkWordA(List<String> texts) {
        return texts.stream().anyMatch(s -> s.startsWith("A"));
    }
}

class Runner {
    public static void main(String[] args) {
        System.out.println(Filter.isEven(new int[]{2, 6, 8, 12}));
        System.out.println(Filter.isEven(new int[]{2, 6, 7, 12}));

        System.out.println(Filter.filterLength(new String[]{"mama", "papa", "books", "forever", "coctail"}));

        List<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        List<Integer> num2 = new ArrayList<>();
        num1.add(3);
        num1.add(2);
        num1.add(1);
        System.out.println(Filter.addAndSum(num1, num2));

        System.out.println(Filter.sorAlphabet(new String[]{"Ravlik", "Annyk", "Bobik", "Lolik"}));

        System.out.println(Filter.checkWordA(List.of("Bob", "Anny", "Foxy")));
    }
}
