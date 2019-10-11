package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5ae62fcf252e66d44d00008e">Expressions Matter</a>
 */

class ExpressionsMatter
{
    static class Kata
    {
        static int expressionsMatter(int a, int b, int c)
        {
            return Math.max(Math.max(a + b + c, a * b * c), Math.max((a + b) * c, a * (b + c)));
        }
    }
}