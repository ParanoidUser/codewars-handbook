package com.codewars.kata.kyu8;

import static java.util.Arrays.stream;

/**
 * @see <a href="https://www.codewars.com/kata/515e271a311df0350d00000f">Square(n) Sum</a>
 */
public class SquareSum
{
    public static int squareSum(int[] n)
    {
        return stream(n).map(i -> i * i).sum();
    }
}
