package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/the-feast-of-many-beasts">The Feast of Many Beasts</a>
 */
public class Feast
{
    public static boolean kata(String beast, String dish)
    {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
}
