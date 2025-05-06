package com.gmail.alinakotova102.drafts.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

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

    }
}
