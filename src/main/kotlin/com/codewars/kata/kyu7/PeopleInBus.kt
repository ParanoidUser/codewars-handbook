package com.codewars.kata.kyu7

/**
 * @see [Number of People in the Bus](https://www.codewars.com/kata/number-of-people-in-the-bus)
 */
fun people(busStops: Array<Pair<Int, Int>>) = busStops.sumBy { it.first - it.second }