package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/up-and-down">up AND down</a>
 */
public class Updown
{
    public static String arrange(String strng)
    {
        var strings = strng.split(" ");
        for (int i = 1; i < strings.length; i++)
        {
            if (i % 2 == 0 && strings[i].length() > strings[i - 1].length() ||
                i % 2 != 0 && strings[i].length() < strings[i - 1].length())
            {
                var tmp = strings[i];
                strings[i] = strings[i - 1];
                strings[i - 1] = tmp;
            }
        }

        for (int i = 0; i < strings.length; i++)
        {
            strings[i] = i % 2 != 0 ? strings[i].toUpperCase() : strings[i].toLowerCase();
        }
        return String.join(" ", strings);
    }
}