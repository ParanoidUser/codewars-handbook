package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/invert-values">Invert values</a>
 */
public class InvertValues
{
    public static int[] kata(int[] array)
    {
        return Arrays.stream(array).map(i -> -i).toArray();
    }
}