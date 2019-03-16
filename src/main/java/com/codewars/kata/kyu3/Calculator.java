package com.codewars.kata.kyu3;

import javax.script.ScriptEngineManager;

/**
 * @see <a href="https://www.codewars.com/kata/calculator">Calculator</a>
 */
public class Calculator
{
    public static double kata(String expression)
    {
        try
        {
            var engine = new ScriptEngineManager().getEngineByName("JavaScript");
            return Double.parseDouble(String.valueOf(engine.eval(expression)));
        }
        catch (Exception cause)
        {
            return 0.0;
        }
    }
}
