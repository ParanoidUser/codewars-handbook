package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5772da22b89313a4d50012f7">Grasshopper - Personalized Message</a>
 */
class GrasshopperPersonalizedMessage
{
    static String greet(String name, String owner)
    {
        return "Hello " + (name.equals(owner) ? "boss" : "guest");
    }
}