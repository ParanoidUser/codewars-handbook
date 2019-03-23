package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/all-star-code-challenge-number-18">All Star Code Challenge #18</a>
 */
public class StrCount
{
    public static int kata(String str, char letter)
    {
        return (int) str.chars()
                        .filter(c -> c == letter)
                        .count();
    }
}