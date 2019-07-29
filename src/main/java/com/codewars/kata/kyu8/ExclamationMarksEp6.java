package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57faf7275c991027af000679">Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right</a>
 */
class ExclamationMarksEp6
{
    static String remove(String s, int n)
    {
        while (n-- > 0)
        {
            s = s.replaceFirst("!", "");
        }
        return s;
    }
}