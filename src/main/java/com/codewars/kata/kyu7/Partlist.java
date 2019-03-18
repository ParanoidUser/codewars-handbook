package com.codewars.kata.kyu7;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/parts-of-a-list">Parts of a list</a>
 */
public class Partlist
{
    public static String[][] kata(String[] arr)
    {
        var pairs = new String[arr.length - 1][2];
        for (int i = 0; i < pairs.length; i++)
        {
            pairs[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i + 1));
            pairs[i][1] = String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length));
        }
        return pairs;
    }
}