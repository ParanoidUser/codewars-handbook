package com.codewars.kata.kyu8;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/reversed-sequence">Reversed sequence</a>
 */
public class Sequence
{
    public static int[] kata(int n)
    {
        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }
}