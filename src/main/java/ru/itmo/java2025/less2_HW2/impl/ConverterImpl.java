package ru.itmo.java2025.less2_HW2.impl;

import org.springframework.stereotype.Component;
import ru.itmo.java2025.less2_HW2.Converter;

@Component
public class ConverterImpl implements Converter {

    @Override
    public double conv(double value, ConverterUnits from, ConverterUnits to) {
        double celsiusValue = toCelsius(value, from);
        return fromCelsius(celsiusValue, to);
    }

    private static double toCelsius(double value, ConverterUnits from) {
        return switch (from) {
            case ConverterUnits.CELSIUS -> value;
            case ConverterUnits.FAHRENHEIT -> (value - 32) * 5.0/9.0;
            case ConverterUnits.KELVIN -> value - 273.15;
            default -> throw new IllegalStateException("Не поддерживается: " + from);
        };
    }

    private double fromCelsius(double value, ConverterUnits toUnit) {
        return switch (toUnit) {
            case ConverterUnits.CELSIUS -> value;
            case ConverterUnits.FAHRENHEIT -> (value * 9.0/5.0) + 32;
            case ConverterUnits.KELVIN -> value + 273.15;
            default -> throw new IllegalStateException("Не поддерживается: " + toUnit);
        };
    }

}
