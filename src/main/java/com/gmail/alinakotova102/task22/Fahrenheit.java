package com.gmail.alinakotova102.task22;

import org.junit.Test;

public class Fahrenheit extends Converter {
    @Override
    public double temperatureConversion(int degreeCelsius) {
        return degreeCelsius * 1.8 + 32;
    }
}