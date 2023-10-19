# [Simple Fun #122: String Constructing](https://www.codewars.com/kata/simple-fun-number-122-string-constructing "https://www.codewars.com/kata/58a3a735cebc0630830000c0")

You are given two string `a` an `s`. Starting with an empty string we can do the following two
operations:

```
append the given string a to the end of the current string. erase one symbol of the current string.
```

Your task is to find the least number of operations needed to construct the given string s. Assume
that all the letters from `s` appear in `a` at least once.

## Example

For `a = "aba", s = "abbaab"`, the result should be `6`.

Construction:

`"" -> "aba" -> "ab" -> "ababa" -> "abba" -> "abbaaba" -> "abbaab".`

So, the result is 6.

For `a = "aba", s = "a"`, the result should be `3`.

Construction:

`"" -> "aba" -> "ab" -> "a".`

So, the result is 3.

For `a = "aba", s = "abaa"`, the result should be `4`.

Construction:

`"" -> "aba" -> "abaaba" -> "abaab" -> "abaa".`

So, the result is 4.

## Input/Output

- `[input]` string `a`

string to be appended. Contains only lowercase English letters.

1 <= a.length <= 20

- `[input]` string `s`

desired string containing only lowercase English letters.

1 <= s.length < 1000

- `[output]` an integer

minimum number of operations