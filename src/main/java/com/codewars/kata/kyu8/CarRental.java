package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/transportation-on-vacation">Transportation on vacation</a>
 */
public class CarRental
{
    public static int kata(int d)
    {
        return 40 * d - (d > 6 ? 50 : d > 2 ? 20 : 0);
    }
}
