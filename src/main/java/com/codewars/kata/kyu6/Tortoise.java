package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/tortoise-racing">Tortoise racing</a>
 */
public class Tortoise
{
    public static int[] kata(int v1, int v2, int g)
    {
        if (v1 >= v2)
        {
            return null;
        }

        int duration = g * 3600 / (v2 - v1);
        return new int[] { duration / 3600, duration % 3600 / 60, duration % 60 };
    }
}
