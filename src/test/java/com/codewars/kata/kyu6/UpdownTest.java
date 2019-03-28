package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UpdownTest
{
    @Test
    void sample()
    {
        assertEquals("be ARRIVED two AFTER my SO", Updown.arrange("after be arrived two My so"));
        assertEquals("who RETAINING hit THAT a THE we TAKEN", Updown.arrange("who hit retaining The That a we taken"));
        assertEquals("i CAME on WERE up GRANDMOTHERS so", Updown.arrange("on I came up were so grandmothers"));
        assertEquals("way THE my WALL him THEM", Updown.arrange("way the my wall them him"));
        assertEquals("turn GREAT-AUNTS know AUNT a LOOK to BACK", Updown.arrange("turn know great-aunts aunt look A to back"));
    }
}
