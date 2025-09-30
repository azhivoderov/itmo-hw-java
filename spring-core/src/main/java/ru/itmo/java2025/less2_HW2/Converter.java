package ru.itmo.java2025.less2_HW2;

import ru.itmo.java2025.less2_HW2.impl.ConverterUnits;

public interface Converter {
    double conv(double value, ConverterUnits from, ConverterUnits to);
}
