package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/mumbling">Mumbling</a>
 */
public class Accumul
{
    public static String kata(String s)
    {
        var accum = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            accum.append('-').append(Character.toUpperCase(s.charAt(i)));
            for (int j = 0; j < i; j++)
            {
                accum.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return accum.substring(1);
    }
}