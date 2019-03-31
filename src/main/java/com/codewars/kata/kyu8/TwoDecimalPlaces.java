package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/formatting-decimal-places-number-0">Formatting decimal places #0</a>
 */
public class TwoDecimalPlaces
{
    public static double kata(double number)
    {
        return Math.round(number * 100.0) / 100.0;
    }
}