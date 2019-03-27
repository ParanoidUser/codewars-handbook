package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class RotationsTest
{
    @Test
    void sample()
    {
        assertTrue(Rotations.kata("", List.of()));
        assertFalse(Rotations.kata("bsjq", List.of()));
        assertTrue(Rotations.kata("", List.of("bsjq", "qbsj")));
        assertTrue(Rotations.kata("bsjq", List.of("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")));
        assertFalse(Rotations.kata("Ajylvpy", List.of("Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy", "pyAjylv", "vpyAjyl", "ipywee" )));
        assertFalse(Rotations.kata("XjYABhR", List.of("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")));
    }
}
