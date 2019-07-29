package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57eae65a4321032ce000002d">Fake Binary</a>
 */
class FakeBinary
{
    static String fakeBin(String numberString)
    {
        return numberString.replaceAll("[1-4]", "0").replaceAll("[^0]", "1");
    }
}