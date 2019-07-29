package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57e92e91b63b6cbac20001e5">Holiday VIII - Duty Free</a>
 */
class DutyFree
{
    static int dutyFree(int normPrice, int discount, int hol)
    {
        return hol * 100 / (normPrice * discount);
    }
}
