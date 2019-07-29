package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5641a03210e973055a00000d">Formatting decimal places #0</a>
 */
class Numbers
{
    static double TwoDecimalPlaces(double number)
    {
        return Math.round(number * 100.0) / 100.0;
    }
}