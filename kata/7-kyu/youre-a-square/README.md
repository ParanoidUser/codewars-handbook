# [You're a square!](https://www.codewars.com/kata/youre-a-square "https://www.codewars.com/kata/54c27a33fb7da0db0100040e")

You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain� Wait! That's it! You just have to check if your number of building blocks is a _perfect square_.

## Task

Given an integral number, determine if it's a [square number](https://en.wikipedia.org/wiki/Square_number):

> In mathematics, a __square number__ or __perfect square__ is an integer that is the square of an integer; in other words, it is the product of some integer with itself.

The tests will _always_ use some integral number, so don't worry about that in dynamic typed languages.

## Examples

```
is_square (-1) # => false
is_square   0 # => true
is_square   3 # => false
is_square   4 # => true
is_square  25 # => true
is_square  26 # => false
```