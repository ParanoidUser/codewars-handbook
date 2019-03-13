package com.codewars.kata.kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ElevatorTest {
    @Test
    fun testFixed() {
        assertEquals("left", elevator(0, 1, 0))
        assertEquals("right", elevator(0, 1, 1))
        assertEquals("right", elevator(0, 1, 2))
        assertEquals("right", elevator(0, 0, 0))
        assertEquals("right", elevator(0, 2, 1))
    }
}