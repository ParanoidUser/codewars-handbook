package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/57f781872e3d8ca2a000007e">Lost Without a Map</a>
 */
public class Maps
{
    public static int[] kata(int[] arr)
    {
        return Arrays.stream(arr).map(i -> 2 * i).toArray();
    }
}