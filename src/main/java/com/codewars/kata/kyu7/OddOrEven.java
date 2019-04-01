package com.codewars.kata.kyu7;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/5949481f86420f59480000e7">Odd or Even?</a>
 */
public class OddOrEven
{
    public static String kata(int[] array)
    {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
