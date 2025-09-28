package ru.itmo.java2025.less2_HW2;

public interface Converter {
    double conv(double value, String from, String to);
    String[] getConverterUnits();
}
