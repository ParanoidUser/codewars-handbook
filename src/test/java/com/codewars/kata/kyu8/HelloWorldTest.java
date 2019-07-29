package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest
{
    @Test
    void sample()
    {
        assertEquals("hello world!", HelloWorld.greet());
    }
}
