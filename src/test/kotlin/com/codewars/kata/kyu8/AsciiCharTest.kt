package com.codewars.kata.kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AsciiCharTest {
    @Test
    fun sample() {
        assertEquals(65, getAscii('A'))
        assertEquals(32, getAscii(' '))
        assertEquals(33, getAscii('!'))
    }
}