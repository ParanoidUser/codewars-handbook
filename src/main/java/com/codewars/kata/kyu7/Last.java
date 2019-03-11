package com.codewars.kata.kyu7;

import java.util.List;

/**
 * @see <a href="https://www.codewars.com/kata/last">Last</a>
 */
public class Last
{
    public static <T> T kata(final List<T> list)
    {
        return list.get(list.size() - 1);
    }

    public static char kata(final String string)
    {
        return string.charAt(string.length() - 1);
    }

    public static <T> T kata(final T... list)
    {
        return list[list.length - 1];
    }
}
