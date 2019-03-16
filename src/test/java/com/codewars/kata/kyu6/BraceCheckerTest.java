package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BraceCheckerTest
{
    @Test
    void sample()
    {
        assertTrue(BraceChecker.kata("()"));
        assertTrue(BraceChecker.kata("(){}[]"));
        assertTrue(BraceChecker.kata("([{}])"));
        assertFalse(BraceChecker.kata("(}"));
        assertFalse(BraceChecker.kata("[(])"));
        assertFalse(BraceChecker.kata("[({})](]"));
    }
}
