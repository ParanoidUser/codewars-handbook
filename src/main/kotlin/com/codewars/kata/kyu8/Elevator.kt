package com.codewars.kata.kyu8

/**
 * @see [Closest elevator](https://www.codewars.com/kata/closest-elevator)
 */
fun elevator(left: Int, right: Int, call: Int) = if (Math.abs(left - call) < Math.abs(right - call)) "left" else "right"