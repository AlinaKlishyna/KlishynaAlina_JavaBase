package com.gmail.alinakotova102.drafts.stream;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public class StreamList {

    public static void main(String[] args) {
        List<String> nameList = List.of("Анна", "Егор", "Женя", "Владислав", "Алина");
        // метод generate - внутри хранится Supplier(функциональный интерфейс) ничего не принимает, но
        //Stream.generate(() -> 0).forEach(System.out::println);

        //Stream.of() - создает поток из "своих" данных
        Stream<String> names = Stream.of("Анна", "Егор", "Женя", "Владислав", "Алина");
        //.sorted() - сортирует по алфавиту
        names.sorted().forEach(System.out::println); //forEach() - является терминальным(конечным) методом

        //count - является терминальной операцией и возвращает long
        System.out.println(nameList.stream().filter(x -> x.length()<5).count());

        //.iterate(начальное значение, и то что мы делаем с этим значением)
        Stream<BigInteger> infinity = Stream.iterate(BigInteger.ONE, x -> x.add(BigInteger.ONE));
        //infinity.forEach(System.out::println);   - бесконечный вывод

        //.map - преобразовывает элементы в то, что нам нудно, в данном случае в число
        //так же можно написать более скорочено .map(String::length())
        List<Integer> collect = nameList.stream().map(x -> x.length()).toList();
        System.out.println("Сумма чисел: " + collect);

        //.filter() - класс Predicate, который принимает функцию и возвращает boolean
        List<String> nameWithFilter = nameList.stream().filter(x -> x.length() > 4).toList();
        System.out.println("Имена от 4 длинны: " + nameWithFilter);

        //через map преобразовали текст в UPPERCASE
        List<String> nameUpperCase = nameList.stream().map(String::toUpperCase).toList();
        System.out.println("Через map() преобразовали в большие буквы: " + nameUpperCase);
    }
}
