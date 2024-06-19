package stepik.digits;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        String krug = String.valueOf(line);
        char[] arr = krug.toCharArray();
        int count = 0;
        for (char element : arr) {
            if (element == '0' || element == '6' || element == '9'){
                count++;
            } else if (element == '8') {
                count+=2;
            }
        }
        System.out.println(count);

    }
}
