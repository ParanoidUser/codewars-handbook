package com.codewars.kata.kyu7;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @see <a href="https://www.codewars.com/kata/ones-and-zeros">Ones and Zeros</a>
 */
public class OnesAndZeros
{
    public static int kata(List<Integer> binary)
    {
        return Integer.parseInt(binary.stream()
                                      .map(String::valueOf)
                                      .collect(Collectors.joining("")), 2);
    }
}