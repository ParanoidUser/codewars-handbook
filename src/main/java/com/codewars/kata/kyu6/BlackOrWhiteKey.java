package com.codewars.kata.kyu6;

import java.util.Set;

/**
 * @see <a href="https://www.codewars.com/kata/piano-kata-part-1">Piano Kata, Part 1</a>
 */
public class BlackOrWhiteKey
{
    public static String kata(int keyPressCount)
    {
        return Set.of(1, 4, 6, 9, 11).contains((keyPressCount - 1) % 88 % 12) ? "black" : "white";
    }
}
