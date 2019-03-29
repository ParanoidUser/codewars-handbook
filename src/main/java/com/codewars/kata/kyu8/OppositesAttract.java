package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/opposites-attract">Opposites Attract</a>
 */
public class OppositesAttract
{
    public static boolean kata(final int flower1, final int flower2)
    {
        return flower1 % 2 != flower2 % 2;
    }
}