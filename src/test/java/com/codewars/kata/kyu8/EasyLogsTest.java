package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EasyLogsTest
{
    @Test
    void sample()
    {
        assertEquals(0.7781512503836435, EasyLogs.kata(10, 2, 3), 0.0000001);
        assertEquals(1.1132827525593785, EasyLogs.kata(5, 2, 3), 0.0000001);
        assertEquals(0.25938375012788123, EasyLogs.kata(1000, 2, 3), 0.0000001);
    }
}
