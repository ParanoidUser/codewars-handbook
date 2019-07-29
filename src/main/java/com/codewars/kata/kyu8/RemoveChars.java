package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0">Remove First and Last Character</a>
 */
class RemoveChars
{
    static String remove(String str)
    {
        return str.substring(1, str.length() - 1);
    }
}
