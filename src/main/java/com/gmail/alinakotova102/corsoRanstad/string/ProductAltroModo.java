package com.gmail.alinakotova102.corsoRanstad.string;

import java.util.Arrays;

public class ProductAltroModo {
    public static void main(String[] args) {
        String logs= "Banana:1:1.60:16/07/2025*Arancia:2:2.26:18/07/2025";

        String[] position = logs.split("\\*");

        String[] product = new String[position.length];
        int[] quantity = new int[position.length];
        double[] price = new double[position.length];
        String[] temp = new String[position.length];

        for (int i=0; i<position.length;i++) {
            String[] item = position[i].split(":");

            for (int j=0; j<position.length;j++) {
                product[i] = item[j];
                quantity[i] = Integer.parseInt(item[j + 1]);
                price[i] = Double.parseDouble(item[j + 2]);
                temp[i] = item[j + 3];
               break;
            }
        }

        System.out.println(Arrays.toString(product));
        System.out.println(Arrays.toString(quantity));
        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(temp));

        //check
        double sum = 0;
        for (int i = 0; i < position.length; i++) {
            sum+=price[i]*quantity[i];
        }
        System.out.println("Sum: " + sum);
    }
}
