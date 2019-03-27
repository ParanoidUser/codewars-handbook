package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/simple-beads-count">Simple beads count</a>
 */
public class BeadsCounter
{
    public static int kata(int nBlue)
    {
        return nBlue < 2 ? 0 : 2 * nBlue - 2;
    }
}
