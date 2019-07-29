package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5302d846be2a9189af0001e4">Welcome to the City</a>
 */
class Hello
{
    static String sayHello(String[] name, String city, String state)
    {
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }
}