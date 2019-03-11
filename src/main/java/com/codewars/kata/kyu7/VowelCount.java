package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/vowel-count">Vowel Count</a>
 */
public class VowelCount
{
    public static int kata(String str)
    {
        return (int) str.chars()
                        .mapToObj(c -> (char) c)
                        .filter(c -> "aeoiu".contains(String.valueOf(c)))
                        .count();
    }
}