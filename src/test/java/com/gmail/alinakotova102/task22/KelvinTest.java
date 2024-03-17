package com.gmail.alinakotova102.task22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelvinTest {
    final double PRECISION = 0.00001;
    Kelvin kelvin;

    @BeforeEach
    void setUp() {
        kelvin = new Kelvin();
    }

    @Test
    void temperatureConversionFromCelsius() {
        double actual = kelvin.temperatureFromCelsius(10);

        double expected = 283.15;

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void temperatureConversionFromCelsiusNegative() {
        double actual = kelvin.temperatureFromCelsius(-10);

        double expected = 263.15;

        assertEquals(expected, actual, PRECISION);
    }
}