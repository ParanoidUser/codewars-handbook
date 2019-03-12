package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/going-to-the-cinema">Going to the cinema</a>
 */
public class Movie
{
    public static int kata(int card, int ticket, double perc)
    {
        int times = 1;
        while(++times * ticket <= Math.ceil(card + ticket * ((1 - Math.pow(perc, times + 1)) / (1 - perc) - 1)));
        return times;
    }
}
