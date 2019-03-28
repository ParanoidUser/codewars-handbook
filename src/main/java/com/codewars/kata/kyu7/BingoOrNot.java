package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/bingo-or-not">Bingo (Or Not)</a>
 */
public class BingoOrNot
{
    public static String kata(int[] numberArray)
    {
        int x = 0;
        for (int a : numberArray)
        {
            if ((x |= 1 << a & 49796) == 49796)
            {
                return "WIN";
            }
        }
        return "LOSE";
    }
}
