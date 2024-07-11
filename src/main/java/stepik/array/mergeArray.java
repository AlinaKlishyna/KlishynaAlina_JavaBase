package stepik.array;


import java.util.Arrays;

public class mergeArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3})));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int j =0;
        for (int a : a1) {
            res[j++] = a;
        }
        for (int a : a2) {
            res[j++] = a;
        }

        for (int i = 0; i < res.length-1; i++) {
            while (res[i]>res[i+1]) {
                int save = res[i];
                res[i] = res[i+1];
                res[i+1] = save;
                i=0;
            }
        }
        return res;
    }
}
