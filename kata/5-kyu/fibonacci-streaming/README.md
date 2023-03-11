# [Fibonacci Streaming](https://www.codewars.com/kata/fibonacci-streaming "https://www.codewars.com/kata/55695bc4f75bbaea5100016b")

You're going to provide a needy programmer a utility method that generates an infinite sized,
sequential `IntStream` (in TypeScript and JS `Iterator<number>`, in Python `generator`) which
contains all the numbers in a fibonacci sequence.

Use `BigInt` in JS as numbers get too big for JS.

A fibonacci sequence starts with two `1`s. Every element afterwards is the sum of the two previous
elements. See:

    1, 1, 2, 3, 5, 8, 13, ..., 89, 144, 233, 377, ...