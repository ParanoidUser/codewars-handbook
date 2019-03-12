package com.codewars.kata.kyu7

/**
 * @see [Plus - minus - plus - plus - ... - Count](https://www.codewars.com/kata/plus-minus-plus-plus-dot-dot-dot-count)
 */
fun catchSignChange(arr: Array<Int>) = arr.map { it < 0 }.zipWithNext { a, b -> a != b }.count { it }
