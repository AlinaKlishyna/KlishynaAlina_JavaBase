package javarush.list.arraylists;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListShortWords {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> line = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            line.add(buf.readLine());
        }
        buf.close();

        String min = line.get(0);
        for (String value : line) {
            if (min.length() > value.length()) {
                min = value;
            }
        }

        for (String value : line) {
            if (min.length() == value.length()) {
                System.out.println(value);
            }
        }
    }
}