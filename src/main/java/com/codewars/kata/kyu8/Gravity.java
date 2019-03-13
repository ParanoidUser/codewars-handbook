package com.codewars.kata.kyu8;

import java.util.Map;

/**
 * @see <a href="https://www.codewars.com/kata/find-the-force-of-gravity-between-two-objects">Find the force of gravity between two objects</a>
 */
public class Gravity
{
    public static double kata(double[] arrVal, String[] arrUnit)
    {
        var units = Map.of("μg", 1e-9, "mg", 1e-6, "g", 0.001, "lb", 0.453592, "kg", 1.0,
                           "μm", 1e-6, "mm", 0.001, "cm", 0.01, "ft", 0.3048, "m", 1.0);

        double m1 = arrVal[0] * units.get(arrUnit[0]);
        double m2 = arrVal[1] * units.get(arrUnit[1]);
        double r = arrVal[2] * units.get(arrUnit[2]);
        return 6.67e-11 * m1 * m2 / r / r;
    }
}
