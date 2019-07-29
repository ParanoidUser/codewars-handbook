package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57202aefe8d6c514300001fd">if..else and ternary operator</a>
 */
class SaleHotdogs
{
    static int saleHotdogs(int n)
    {
        return n * (n < 5 ? 100 : n < 10 ? 95 : 90);
    }
}