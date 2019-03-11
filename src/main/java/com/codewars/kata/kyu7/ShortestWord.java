package com.codewars.kata.kyu7;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/shortest-word">Shortest Word</a>
 */
public class ShortestWord
{
    public static int kata(String s)
    {
        return Arrays.stream(s.split(" "))
                     .mapToInt(String::length)
                     .min()
                     .getAsInt();
    }
}
