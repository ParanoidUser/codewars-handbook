package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/exclamation-marks-series-number-6-remove-n-exclamation-marks-in-the-sentence-from-left-to-right">Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right</a>
 */
public class ExclamationMarksEp6
{
    public static String kata(String s, int n)
    {
        while(n-- > 0)
        {
            s = s.replaceFirst("!", "");
        }
        return s;
    }
}