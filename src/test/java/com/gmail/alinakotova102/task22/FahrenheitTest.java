package com.gmail.alinakotova102.task22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitTest {
    final double PRECISION = 0.00001;
    Fahrenheit fahrenheit;

    @BeforeEach
    void setUp() {
        fahrenheit = new Fahrenheit();
    }

    @Test
    void temperatureConversion() {
        double actual = fahrenheit.temperatureConversion(10);

        double expected = 50;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureConversionNegative() {
        double actual = fahrenheit.temperatureConversion(-5);

        double expected = 23;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureConversionZero() {
        double actual = fahrenheit.temperatureConversion(0);

        double expected = 32;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureConversionFloat() {
        double actual = fahrenheit.temperatureConversion(5.5);

        double expected = 41.9;

        assertEquals(expected, actual, PRECISION);
    }
}