package stepik.poweroftwo;

import java.util.Arrays;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));

        int[] array = new int[5]; // размер массива 5 и автоматически под капотом будет так int[] array = {0, 0, 0, 0, 0};
        String[] array2 = new String[5]; // {null, null, null, null, null};
        boolean[] array3 = new boolean[5]; //{false, false, false, false, false}
        System.out.println(Arrays.toString(array));
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }

    // Integer.bitCount() если число можно воспроизвести в степень 2,то выведет 0
    // в ином случае - другое число
}
