package com.gmail.alinakotova102.task22;

public class Kelvin extends Converter {

    @Override
    public double temperatureConversionFromCelsius(double degreeCelsius) {
        return degreeCelsius + T0;
    }

    @Override
    double temperatureConversionToCelsius(double degreeCelsius) {
        return 0;
    }
}