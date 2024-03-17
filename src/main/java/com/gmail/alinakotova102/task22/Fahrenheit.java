package com.gmail.alinakotova102.task22;

public class Fahrenheit extends Converter {
    @Override
    public double temperatureConversionFromCelsius(double degreeCelsius) {
        return (degreeCelsius * 1.8) + 32;
    }
}