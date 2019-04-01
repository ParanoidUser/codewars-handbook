package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SaleHotdogsTest
{
    @Test
    void sample()
    {
        assertEquals(100, SaleHotdogs.kata(1));
        assertEquals(400, SaleHotdogs.kata(4));
        assertEquals(475, SaleHotdogs.kata(5));
        assertEquals(855, SaleHotdogs.kata(9));
        assertEquals(900, SaleHotdogs.kata(10));
        assertEquals(9000, SaleHotdogs.kata(100));
    }
}
