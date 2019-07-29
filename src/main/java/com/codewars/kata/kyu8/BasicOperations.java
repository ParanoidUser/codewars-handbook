package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/57356c55867b9b7a60000bd7">Basic Mathematical Operatio</a>
 */
class BasicOperations
{
    static Integer basicMath(String op, int v1, int v2)
    {
        return op == "*" ? v1 * v2 : op == "/" ? v1 / v2 : v1 + (op == "+" ? v2 : -v2);
    }
}