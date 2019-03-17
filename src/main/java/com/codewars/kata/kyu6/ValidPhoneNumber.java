package com.codewars.kata.kyu6;

/**
 * @see <a href="https://www.codewars.com/kata/valid-phone-number">Valid Phone Number</a>
 */
public class ValidPhoneNumber
{
    public static boolean kata(String phoneNumber)
    {
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
    }
}
