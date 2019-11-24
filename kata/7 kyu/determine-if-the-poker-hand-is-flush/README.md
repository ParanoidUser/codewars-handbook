# [Determine if the poker hand is flush](https://www.codewars.com/kata/determine-if-the-poker-hand-is-flush "https://www.codewars.com/kata/5acbc3b3481ebb23a400007d")

Determine if the poker hand is flush, meaning if the five cards are of the **same suit**.

Your function will be passed a list/array of 5 strings, each representing a poker card in the format `"5H"` (5 of hearts), meaning the value of the card followed by the initial of its suit (`H`earts, `S`pades, `D`iamonds or `C`lubs). No jokers included.

Your function should return `true` if the hand is a flush, `false` otherwise.

The possible card values are `2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A`

## Examples
```
["AS", "3S", "9S", "KS", "4S"]  ==> true

["AD", "4S", "7H", "KS", "10S"] ==> false
```
