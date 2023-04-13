# [Find the index of the second occurrence of a letter in a string](https://www.codewars.com/kata/find-the-index-of-the-second-occurrence-of-a-letter-in-a-string "https://www.codewars.com/kata/63f96036b15a210058300ca9")

In this kata, you need to write a function that takes a string and a letter as input and then
returns the index of the second occurrence of that letter in the string. If there is no such letter
in the string, then the function should return -1. If the letter occurs only once in the string,
then -1 should also be returned.

Examples:

```
secondSymbol('Hello world!!!','l') --> 3
secondSymbol('Hello world!!!', 'A') --> -1
```