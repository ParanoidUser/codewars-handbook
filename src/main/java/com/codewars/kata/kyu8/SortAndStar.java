package com.codewars.kata.kyu8;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/sort-and-star">Sort and Star</a>
 */
public class SortAndStar
{
    public static String kata(String[] s)
    {
        Arrays.sort(s);
        return s[0].replaceAll(".(?!$)", "$0***");
    }
}