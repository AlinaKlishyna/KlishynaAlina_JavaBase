package com.gmail.alinakotova102.task22.run;

import com.gmail.alinakotova102.task22.Fahrenheit;
import com.gmail.alinakotova102.task22.Kelvin;

public class ConverterRun {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        System.out.printf("T(%s) = %.3f°F\n", Fahrenheit.class.getSimpleName(), fahrenheit.temperatureConversion(10));

        Kelvin kelvin = new Kelvin();
        System.out.printf("T(%s) = %.3f°K\n", Kelvin.class.getSimpleName(), kelvin.temperatureConversion(10));
    }
}