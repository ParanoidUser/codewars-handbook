package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarRentalTest
{
    @Test
    void sample()
    {
        assertEquals(40, CarRental.kata(1));
        assertEquals(80, CarRental.kata(2));
        assertEquals(100, CarRental.kata(3));
        assertEquals(140, CarRental.kata(4));
        assertEquals(180, CarRental.kata(5));
        assertEquals(220, CarRental.kata(6));
        assertEquals(230, CarRental.kata(7));
        assertEquals(270, CarRental.kata(8));
        assertEquals(310, CarRental.kata(9));
        assertEquals(350, CarRental.kata(10));
    }
}
