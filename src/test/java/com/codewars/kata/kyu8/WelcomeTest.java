package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WelcomeTest
{
    @Test
    void sample()
    {
        assertEquals("Welcome", Welcome.kata("english"));
        assertEquals("Welkom", Welcome.kata("dutch"));
        assertEquals("Welcome", Welcome.kata("IP_ADDRESS_INVALID"));
    }
}
