package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/remove-first-and-last-character">Remove First and Last Character</a>
 */
public class RemoveChars
{
    public static String kata(String str)
    {
        return str.substring(1, str.length() - 1);
    }
}
