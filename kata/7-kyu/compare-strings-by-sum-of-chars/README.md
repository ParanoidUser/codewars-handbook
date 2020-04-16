# [Compare Strings by Sum of Chars](https://www.codewars.com/kata/compare-strings-by-sum-of-chars "https://www.codewars.com/kata/576bb3c4b1abc497ec000065")

Compare two strings by comparing the sum of their values (ASCII character code).

* For comparing treat all letters as UpperCase
* `null/NULL/Nil/None` should be treated as empty strings
* If the string contains other characters than letters, treat the whole string as it would be empty

Your method should return `true`, if the strings are equal and `false` if they are not equal.

## Examples:
```
"AD", "BC"  -> equal
"AD", "DD"  -> not equal
"gf", "FG"  -> equal
"zz1", ""   -> equal (both are considered empty)
"ZzZz", "ffPFF" -> equal
"kl", "lz"  -> not equal
null, ""    -> equal
```
