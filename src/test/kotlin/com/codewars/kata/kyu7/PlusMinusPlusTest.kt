package com.codewars.kata.kyu7


import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PlusMinusPlusTest {

    @Test
    fun test() {
        assertEquals(0, catchSignChange(arrayOf(1, 3, 4, 5)))
        assertEquals(0, catchSignChange(arrayOf()))
        assertEquals(2, catchSignChange(arrayOf(1, -3, -4, 0, 5)))
        assertEquals(3, catchSignChange(arrayOf(-47,84,-30,-11,-5,74,77)))
    }
}