package com.codewars.kata.kyu4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ConnectFourTest
{
    @Test
    void sample()
    {
        assertEquals("Yellow", ConnectFour.kata(List.of(
                "A_Red", "B_Yellow",
                "A_Red", "B_Yellow",
                "A_Red", "B_Yellow",
                "G_Red", "B_Yellow")));

        assertEquals("Yellow", ConnectFour.kata(List.of(
                "C_Yellow", "E_Red",
                "G_Yellow", "B_Red",
                "D_Yellow", "B_Red",
                "B_Yellow", "G_Red",
                "C_Yellow", "C_Red",
                "D_Yellow", "F_Red",
                "E_Yellow", "A_Red",
                "A_Yellow", "G_Red",
                "A_Yellow", "F_Red",
                "F_Yellow", "D_Red",
                "B_Yellow", "E_Red",
                "D_Yellow", "A_Red",
                "G_Yellow", "D_Red",
                "D_Yellow", "C_Red")));

        assertEquals("Red", ConnectFour.kata(List.of(
                "A_Yellow", "B_Red",
                "B_Yellow", "C_Red",
                "G_Yellow", "C_Red",
                "C_Yellow", "D_Red",
                "G_Yellow", "D_Red",
                "G_Yellow", "D_Red",
                "F_Yellow", "E_Red",
                "D_Yellow")));
    }
}
