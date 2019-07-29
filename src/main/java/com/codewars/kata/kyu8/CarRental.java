package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/568d0dd208ee69389d000016">Transportation on vacation</a>
 */
class CarRental
{
    static int rentalCarCost(int d)
    {
        return 40 * d - (d > 6 ? 50 : d > 2 ? 20 : 0);
    }
}