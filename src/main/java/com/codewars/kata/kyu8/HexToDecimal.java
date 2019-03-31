package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/hex-to-decimal">Hex to Decimal</a>
 */
public class HexToDecimal
{
    public static int kata(String hexString)
    {
        return Integer.parseInt(hexString, 16);
    }
}
