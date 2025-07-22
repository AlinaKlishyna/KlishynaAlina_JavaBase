package com.gmail.alinakotova102.corsoRanstad.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Frutti {
    static LinkedList<String> frutti = new LinkedList<>();

    public static void main(String[] args) {
        // Добавьте в список элементы: «Яблоко», «Банан», «Апельсин»
        frutti.add("Яблоко");
        frutti.add("Банан");
        frutti.add("Апельсин");

        // Распечатайте полный список LinkedList
        System.out.println(frutti);

        //Добавьте «Киви» в начало списка
        frutti.addFirst("Киви");

        //Добавьте «Груша» в конец списка
        frutti.addLast("Груша");

        // Извлекает и печатает первый элемент списка
        System.out.println(frutti.getFirst());

        // Извлекает и печатает последний элемент списка
        System.out.println(frutti.getLast());

        // Измените второй элемент на «Клубника»
        frutti.add(2, "Клубника");

        // Удалить пункт «Банан» из списка
        frutti.remove("Банан");

        // Удалить первый элемент из списка
        frutti.removeFirst();

        // Удалить последний элемент из списка
        frutti.removeLast();

        // Проверьте, содержит ли список слово «Оранжевый»
        frutti.contains("Оранжевый");

        // Распечатайте размер списка
        System.out.println(frutti.size());

        // Очистите свой LinkedList
        frutti.clear();

        // Проверьте, пуст ли список
        frutti.isEmpty();

        // Добавить список элементов из массива: {"Ананас", "Дыня", "Виноград"}
        frutti.addAll(List.of(new String[]{"Ананас", "Дыня", "Виноград"}));
        System.out.println(frutti);

        // Пройдитесь по списку и выведите каждый элемент с помощью цикла for-each
        for (String frutto : frutti) {
            System.out.println(frutto);
        }

        // На второе место в списке поставьте «Вишня»
        frutti.add(2, "Вишня");

        // Создает копию исходного LinkedList в другом LinkedList
        LinkedList<String> fruttiCopie = new LinkedList<>(frutti);

        // Отсортируйте LinkedList по алфавиту и распечатайте его
        Collections.sort(frutti);
        System.out.println(frutti);
    }
}
