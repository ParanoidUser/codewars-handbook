package com.codewars.kata.kyu7

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * @see [Number of People in the Bus](https://www.codewars.com/kata/number-of-people-in-the-bus)
 */
fun people(busStops: Array<Pair<Int, Int>>) = busStops.sumBy { it.first - it.second }

class TestExample {
    @Test
    fun `Basic Tests`() {
        assertEquals(17, people(arrayOf(3 to 0, 9 to 1, 4 to 10, 12 to 2, 6 to 1, 7 to 10)))
        assertEquals(21, people(arrayOf(3 to 0, 9 to 1, 4 to 8, 12 to 2, 6 to 1, 7 to 8)))
        assertEquals(5, people(arrayOf(10 to 0, 3 to 5, 5 to 8)))
    }
}