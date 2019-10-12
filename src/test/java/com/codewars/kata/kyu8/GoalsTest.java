package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GoalsTest
{
    @Test
    void sample()
    {
        assertEquals(17, Goals.goals(5,10,2));
        assertEquals(0, Goals.goals(0, 0, 0));
        assertEquals(58, Goals.goals(43, 10, 5));
    }
}