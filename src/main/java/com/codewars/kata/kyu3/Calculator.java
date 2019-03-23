package com.codewars.kata.kyu3;

import java.util.LinkedList;

/**
 * @see <a href="https://www.codewars.com/kata/calculator">Calculator</a>
 */
public class Calculator
{
    public static double kata(String expression)
    {
        var parts = expression.split(" ");
        var mem = new LinkedList<Double>();

        for (int i = 0; i < parts.length; i += 2)
        {
            if (i == 0 || parts[i - 1].equals("+"))
            {
                mem.push(Double.valueOf(parts[i]));
            }
            else if (parts[i - 1].equals("-"))
            {
                mem.push(-Double.valueOf(parts[i]));
            }
            else if (parts[i - 1].equals("*"))
            {
                mem.push(mem.pop() * Double.valueOf(parts[i]));
            }
            else if (parts[i - 1].equals("/"))
            {
                mem.push(mem.pop() / Double.valueOf(parts[i]));
            }
        }

        double r = 0.0;
        while (!mem.isEmpty())
        {
            r += mem.pop();
        }
        return r;
    }
}
