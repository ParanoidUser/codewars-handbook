package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarRentalTest
{
    @Test
    void sample()
    {
        assertEquals(40, CarRental.rentalCarCost(1));
        assertEquals(80, CarRental.rentalCarCost(2));
        assertEquals(100, CarRental.rentalCarCost(3));
        assertEquals(140, CarRental.rentalCarCost(4));
        assertEquals(180, CarRental.rentalCarCost(5));
        assertEquals(220, CarRental.rentalCarCost(6));
        assertEquals(230, CarRental.rentalCarCost(7));
        assertEquals(270, CarRental.rentalCarCost(8));
        assertEquals(310, CarRental.rentalCarCost(9));
        assertEquals(350, CarRental.rentalCarCost(10));
    }
}
