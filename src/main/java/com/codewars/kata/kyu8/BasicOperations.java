package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/basic-mathematical-operations">Basic Mathematical Operatio</a>
 */
public class BasicOperations
{
    public static Integer kata(String op, int v1, int v2)
    {
        if (op == "*") return v1 * v2;
        if (op == "/") return v1 / v2;
        return v1 + (op == "+" ? v2 : -v2);
    }
}