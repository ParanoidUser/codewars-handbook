package com.codewars.kata.kyu7;

import java.util.List;

/**
 * @see <a href="https://www.codewars.com/kata/all-inclusive">All Inclusive?</a>
 */
public class Rotations
{
    public static boolean kata(String strng, List<String> arr)
    {
        for (int i = 0; i < strng.length(); i++)
        {
            if (!arr.contains(strng.substring(i) + strng.substring(0, i)))
            {
                return false;
            }
        }
        return true;
    }
}
