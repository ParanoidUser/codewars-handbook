package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/validate-credit-card-number">Validate Credit Card Number</a>
 */
public class CreditCardValidation
{
    public static boolean kata(String n)
    {
        boolean[] flag = { (n.length() & 1) == 1 };
        return n.chars()
                .map(c -> c - '0')
                .map(num -> (flag[0] ^= true) ? (num * 2 - 1) % 9 + 1 : num)
                .sum() % 10 == 0;
    }
}
