package ru.itmo.java2025.less2_HW2.impl;

import org.springframework.stereotype.Component;
import ru.itmo.java2025.less2_HW2.Converter;

@Component
public class ConverterImpl implements Converter {

    private static final String[] CONVERTER_UNITS = {
            "CELSIUS", "FAHRENHEIT", "KELVIN"
    };

    @Override
    public String[] getConverterUnits() {
        return CONVERTER_UNITS.clone();
    }

    @Override
    public double conv(double value, String from, String to) {
        double celsiusValue = toCelsius(value, from);
        return fromCelsius(celsiusValue, to);
    }

    private double toCelsius(double value, String from) {
        return switch (from.toUpperCase()) {
            case "CELSIUS" -> value;
            case "FAHRENHEIT" -> (value - 32) * 5.0/9.0;
            case "KELVIN" -> value - 273.15;
            default -> value;
        };
    }

    private double fromCelsius(double value, String toUnit) {
        return switch (toUnit.toUpperCase()) {
            case "CELSIUS" -> value;
            case "FAHRENHEIT" -> (value * 9.0/5.0) + 32;
            case "KELVIN" -> value + 273.15;
            default -> value;
        };
    }

}
