package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/holiday-viii-duty-free">Holiday VIII - Duty Free</a>
 */
public class DutyFree
{
    public static int kata(int normPrice, int discount, int hol)
    {
        return hol * 100 / (normPrice * discount);
    }
}
