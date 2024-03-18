package stepik.primitivetipes;

public class ReferenceString {
    public static void main(String[] args) {
        String s1 = "Hello!"; //переменная s1 хранит ссылку в произвольном участке памяти
        String s2 = "Hello!"; //хранит в другом участке памяти не зависимо от значения
        System.out.println(s1.equals(s2)); // true - так как проверяет значение
        System.out.println((s1==s2)); // true - так как проверяет значение

        String s3 = s1;
        System.out.println(s3.equals(s1));// true - так как проверяет значение
        System.out.println((s1==s3));// true - так как проверяет значение

        String s4 = "Hello"; // тут уже другая ячейка памяти
        s4 += "!";
        System.out.println(s4.equals(s1)); // true - так как проверяет значение
        System.out.println(s4==s1); //false - так как при модификации строчки изменяется ячейка памяти

        //new - присваивание новой ссылки
        s1 = new String();
        s2 = new String();
        System.out.println(s1.equals(s2)); //true - проверка по значениям
        System.out.println(s1==s2); //false - разные ссылки

        s3 = s1; //сейчас имеют одинаковые ссылки
        System.out.println(s3==s1); //true - второй обьект(s3) ссылается на ссылку первого

        s3 += "!";
        System.out.println(s3 ==s1); //false - так как при модификации изменяется ячейка памяти

        String text = "Hello!";
        text = new String();

        String text2 = text;
        System.out.println(text == text2); //true - второй обьект(text2) ссылается на ссылку первого
        System.out.println(text.equals(text2)); //true так как имеюь одинаковые значения

        String text3 = new String("Hello!");
        System.out.println(text3==s1); //false / разные ссылки
        System.out.println(text3.equals(s1)); //true - одинаковые значения
    }
}