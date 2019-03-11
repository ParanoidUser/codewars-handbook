package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/vowel-count">Vowel Count</a>
 */
public class Vowels
{
    public static int kata(String str)
    {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}