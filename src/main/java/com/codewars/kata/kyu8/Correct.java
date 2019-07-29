package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/577bd026df78c19bca0002c0">Correct the mistakes of the character recognition software</a>
 */
class Correct
{
    static String correct(String string)
    {
        return string.replace("5", "S")
                     .replace("0", "O")
                     .replace("1", "I");
    }
}