package com.codewars.kata.kyu7;

/**
 * @see <a href="https://www.codewars.com/kata/5701e43f86306a615c001868">Credit card issuer checking</a>
 */
public class IssuerChecker
{
    public static String kata(String cardNumber)
    {
        return cardNumber.matches("^3[4|7].{13}$") ? "AMEX"
             : cardNumber.matches("^6011.{12}$") ? "Discover"
             : cardNumber.matches("^5[1-5].{14}$") ? "Mastercard"
             : cardNumber.matches("^4.{12}(...)?$") ? "VISA" : "Unknown";
    }
}
