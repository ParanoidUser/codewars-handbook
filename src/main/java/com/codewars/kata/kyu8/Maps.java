package com.codewars.kata.kyu8;

import static java.util.Arrays.stream;

/**
 * @see <a href="https://www.codewars.com/kata/57f781872e3d8ca2a000007e">Lost Without a Map</a>
 */
class Maps
{
    static int[] map(int[] arr)
    {
        return stream(arr).map(i -> 2 * i).toArray();
    }
}