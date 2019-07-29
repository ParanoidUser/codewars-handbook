package com.codewars.kata.kyu8;

import static java.util.Arrays.stream;

/**
 * @see <a href="https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad">Invert values</a>
 */
class InvertValues
{
    static int[] invert(int[] array)
    {
        return stream(array).map(i -> -i).toArray();
    }
}