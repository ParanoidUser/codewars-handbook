package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest
{

    @Test
    void tests()
    {
        assertEquals("0/14", Printer.kata("aaabbbbhaijjjm"));
        assertEquals("8/22", Printer.kata("aaaxbbbbyyhwawiwjjjwwm"));
        assertEquals("3/56", Printer.kata("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
    }
}
