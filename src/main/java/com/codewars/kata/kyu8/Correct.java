package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/correct-the-mistakes-of-the-character-recognition-software">Correct the mistakes of the character recognition software</a>
 */
public class Correct
{
    public static String kata(String string)
    {
        return string.replace("5", "S")
                     .replace("0", "O")
                     .replace("1", "I");
    }
}