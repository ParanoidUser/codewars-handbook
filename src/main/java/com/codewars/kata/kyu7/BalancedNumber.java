package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/balanced-number-special-numbers-series-number-1">Balanced Number (Special Numbers Series #1)</a>
 */
public class BalancedNumber
{
    public static String kata(long number)
    {
        var str = String.valueOf(number);
        int l = str.substring(0, str.length() / 2 - (str.length() % 2 == 0 ? 1 : 0)).chars().sum();
        int r = str.substring(str.length() / 2 + 1).chars().sum();
        return (l == r ? "" : "Not ") + "Balanced";
    }
}
