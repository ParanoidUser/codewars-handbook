package com.codewars.kata.kyu7;

import static java.util.stream.Collectors.joining;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/566fc12495810954b1000030">Count the Digit</a>
 */
public class CountDigits
{
    public static int kata(int n, int d)
    {
        return IntStream.rangeClosed(0, n)
                        .mapToObj(i -> i * i + "")
                        .collect(joining())
                        .replaceAll("[^" + d + "]", "")
                        .length();
    }
}
