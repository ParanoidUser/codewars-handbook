package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/fake-binary">Fake Binary</a>
 */
public class FakeBinary
{
    public static String fakeBin(String numberString)
    {
        return numberString.replaceAll("[1-4]", "0").replaceAll("[^0]", "1");
    }
}