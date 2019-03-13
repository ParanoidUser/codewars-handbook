package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NessieTest
{
    @Test
    void testBasicTrue()
    {
        assertTrue(Nessie.kata("Your girlscout cookies are ready to ship. Your total comes to tree fiddy"));
    }

    @Test
    void testBasicFalse()
    {
        assertFalse(Nessie.kata("Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance."));
    }
}
