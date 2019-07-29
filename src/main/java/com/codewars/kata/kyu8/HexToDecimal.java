package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57a4d500e298a7952100035d">Hex to Decimal</a>
 */
class HexToDecimal
{
    static int hexToDec(String hexString)
    {
        return Integer.parseInt(hexString, 16);
    }
}
