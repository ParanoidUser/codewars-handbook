package com.codewars.kata.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/triple-trouble-2">Triple Trouble</a>
 */
public class TripleTrouble
{
    public static String kata(String one, String two, String three)
    {
        return IntStream.range(0, one.length())
                        .mapToObj(i -> "" + one.charAt(i) + two.charAt(i) + three.charAt(i))
                        .collect(Collectors.joining());
    }
}
