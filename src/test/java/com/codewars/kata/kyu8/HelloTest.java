package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloTest
{
    @Test
    void sample()
    {
        String[] name = { "John", "Smith" };
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!", Hello.sayHello(name, "Phoenix", "Arizona"));
    }
}
