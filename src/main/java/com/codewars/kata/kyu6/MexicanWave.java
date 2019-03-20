package com.codewars.kata.kyu6;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/mexican-wave">Mexican Wave</a>
 */
public class MexicanWave
{
    public static String[] kata(String str)
    {
        return IntStream.range(0, str.length())
                        .filter(n -> str.charAt(n) != ' ')
                        .mapToObj(n -> str.substring(0, n) + Character.toUpperCase(str.charAt(n)) + str.substring(n + 1))
                        .toArray(String[]::new);
    }
}
