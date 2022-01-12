# [Scrabble Score](https://www.codewars.com/kata/scrabble-score "https://www.codewars.com/kata/558fa34727c2d274c10000ae")

Write a program that, given a word, computes the scrabble score for that word.

## Letter Values

You'll need these:

```
Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
```

There will be a preloaded class `ScoreBoard` with static method 'getScore' with all these values: `ScoreBoard.getScore('A') == 1`

## Examples
```
"cabbage" --> 14
```

"cabbage" should be scored as worth 14 points:

- 3 points for C
- 1 point for A, twice
- 3 points for B, twice
- 2 points for G
- 1 point for E

And to total:

`3 + 2*1 + 2*3 + 2 + 1` = `3 + 2 + 6 + 3` = `14`


Empty string should return `0`. The string can contain spaces and letters (upper and lower case), you should calculate the scrabble score only of the letters in that string.

```
""           --> 0
"STREET"    --> 6
"st re et"    --> 6
"ca bba g  e" --> 14
```
