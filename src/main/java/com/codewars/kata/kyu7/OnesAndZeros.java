package com.codewars.kata.kyu7;

import java.util.List;

/**
 * @see <a href="https://www.codewars.com/kata/ones-and-zeros">Ones and Zeros</a>
 */
public class OnesAndZeros
{
    public static int kata(List<Integer> binary)
    {
        return binary.stream()
                     .reduce((x, y) -> x * 2 + y)
                     .orElse(0);
    }
}