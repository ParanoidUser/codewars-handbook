package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GrasshopperPersonalizedMessageTest
{
    @Test
    void sample()
    {
        assertEquals("Hello boss", GrasshopperPersonalizedMessage.greet("Daniel", "Daniel"));
        assertEquals("Hello guest", GrasshopperPersonalizedMessage.greet("Greg", "Daniel"));
    }
}
