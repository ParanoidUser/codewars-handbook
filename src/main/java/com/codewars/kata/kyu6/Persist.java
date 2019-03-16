package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/persistent-bugger">Persistent Bugger</a>
 */
public class Persist
{
    public static int kata(long n)
    {
        int times = 0;
        while (n >= 10)
        {
            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
            times++;
        }
        return times;
    }
}
