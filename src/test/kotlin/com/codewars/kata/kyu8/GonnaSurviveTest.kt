package com.codewars.kata.kyu8

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class GonnaSurviveTest {
    @Test
    fun sample() {
        assertTrue(hero(10, 5))
        assertFalse(hero(7, 4))
        assertFalse(hero(4, 5))
        assertTrue(hero(100, 40))
        assertFalse(hero(1500, 751))
        assertFalse(hero(0, 1))
    }
}