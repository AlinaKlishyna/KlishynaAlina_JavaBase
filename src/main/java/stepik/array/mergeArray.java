package stepik.array;


import java.util.Arrays;

public class mergeArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{41, 55, 61, 73}, new int[]{1, 15, 30, 40, 80})));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < result.length; k++) {
            if (i < a1.length && j < a2.length) {
                if (a1[i] < a2[j]) {
                    result[k] = a1[i];
                    i++;
                } else {
                    result[k] = a2[j];
                    j++;
                }
            } else if (i >= a1.length) {
                result[k] = a2[j];
                j++;
            } else {
                result[k] = a1[i];
                i++;
            }
        }
        return result;
    }
}
