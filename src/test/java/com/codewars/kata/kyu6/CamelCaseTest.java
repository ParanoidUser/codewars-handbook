package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CamelCaseTest
{
    @Test
    void sample()
    {
        assertEquals("TestCase", CamelCase.kata("test case"));
        assertEquals("CamelCaseMethod", CamelCase.kata("camel case method"));
        assertEquals("CamelCaseWord", CamelCase.kata(" camel case word"));
        assertEquals("SayHello", CamelCase.kata("say hello "));
        assertEquals("Z", CamelCase.kata("z"));
        assertEquals("AbC", CamelCase.kata("ab  c"));
        assertEquals("", CamelCase.kata(""));
    }
}
