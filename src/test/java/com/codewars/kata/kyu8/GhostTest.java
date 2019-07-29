package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GhostTest
{
    @Test
    void sample()
    {
        var ghost = new Ghost();
        var color = ghost.getColor();

        var changed = false;
        for (int i = 0; i < 10 && !changed; i++)
        {
            changed = !color.equals(ghost.getColor());
        }
        assertTrue(changed);
    }
}
