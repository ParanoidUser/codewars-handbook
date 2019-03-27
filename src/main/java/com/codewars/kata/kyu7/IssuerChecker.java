package com.codewars.kata.kyu7;

public class IssuerChecker
{
    /**
     * @see <a href="https://www.codewars.com/kata/credit-card-issuer-checking">Credit card issuer checking</a>
     */
    public static String kata(String cardNumber)
    {
        return cardNumber.matches("^3[4|7].{13}$") ? "AMEX"
             : cardNumber.matches("^6011.{12}$") ? "Discover"
             : cardNumber.matches("^5[1-5].{14}$") ? "Mastercard"
             : cardNumber.matches("^4.{12}(...)?$") ? "VISA" : "Unknown";
    }
}
