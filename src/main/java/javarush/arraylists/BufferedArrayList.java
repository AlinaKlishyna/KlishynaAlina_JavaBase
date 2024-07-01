package javarush.arraylists;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BufferedArrayList {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(buf.readLine());
        }
        System.out.println(strings);
    }
}
