package stepik.string;

public class TestString {
    public static void main(String[] args) {
        String str = "Mama";
        String str1 = str;
        System.out.println(str == str1); //ссылки указывают на один и тот же обьект "Mama",
        // что уже есть в String Pool
        //выпадает true

        String str2 = "Mama";
        String str21 = "Mama";
        System.out.println(str2 == str21);//так как значение "Mama", уже есть в String Pool
        //поэтому выпадает true

        String str3 = new String("Mama");
        String str31 = new String("Mama");
        System.out.println(str3 == str31); // явно выделяется память в куче под обьекты,
        // поэтому false
    }
}
