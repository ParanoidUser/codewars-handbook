package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/will-there-be-enough-space">Will there be enough space?</a>
 */
public class Bob
{
    public static int kata(int cap, int on, int wait)
    {
        return Math.max(on + wait - cap, 0);
    }
}
