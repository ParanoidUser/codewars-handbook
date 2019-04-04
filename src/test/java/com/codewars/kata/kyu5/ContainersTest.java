package com.codewars.kata.kyu5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContainersTest
{
    @Test
    void sample()
    {
        assertEquals(1, Containers.containers("A"));
        assertEquals(3, Containers.containers("CBACBACBACBACBA"));
        assertEquals(1, Containers.containers("CCCCBBBBAAAA"));
        assertEquals(5, Containers.containers("CODEWARS"));
    }
}
