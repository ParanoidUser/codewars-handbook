package com.codewars.kata.kyu8

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ContainsTest {
    @Test
    fun sample() {
        assertTrue(include(intArrayOf(1, 2, 3, 4), 2))
        assertFalse(include(intArrayOf(1, 2, 4, 5), 3))
    }
}