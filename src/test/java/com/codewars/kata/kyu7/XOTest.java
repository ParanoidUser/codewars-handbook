package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class XOTest
{
    @Test
    void sample()
    {
        assertTrue(XO.kata("xxxooo"));
        assertTrue(XO.kata("xxxXooOo"));
        assertFalse(XO.kata("xxx23424esdsfvxXXOOooo"));
        assertFalse(XO.kata("xXxxoewrcoOoo"));
        assertFalse(XO.kata("XxxxooO"));
        assertTrue(XO.kata("zssddd"));
        assertFalse(XO.kata("Xxxxertr34"));
    }
}
