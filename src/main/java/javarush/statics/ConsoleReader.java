package javarush.statics;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        return line.readLine();
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(line.readLine());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(line.readLine());
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(line.readLine());
    }

    public static void main(String[] args) throws Exception {
        readString();
    }
}
