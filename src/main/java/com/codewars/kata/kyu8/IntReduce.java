package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/beginner-reduce-but-grow">Reduce but Grow</a>
 */
public class IntReduce
{
    public static int kata(int[] x)
    {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }
}
