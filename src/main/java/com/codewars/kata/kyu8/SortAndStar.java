package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/57cfdf34902f6ba3d300001e">Sort and Star</a>
 */
class SortAndStar
{
    static String twoSort(String[] s)
    {
        Arrays.sort(s);
        return s[0].replaceAll(".(?!$)", "$0***");
    }
}