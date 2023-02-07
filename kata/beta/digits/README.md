# [Digits](https://www.codewars.com/kata/digits "https://www.codewars.com/kata/638b042bf418c453377f28ad")

The code consists of four unique digits (from `0` to `9`).

The `check(digits)` function takes an array of four digits, and returns the number of matches
(the same digit in the same place). It also counts the number of tries.

```
interface Checker {
  int check(int[] figure);
}
```

A good balanced algorithm can find the code in `15` tries or less.
You are the best. Do it.

## For example

Searching digits are `[1, 2, 3, 4]`<br>
`check([1, 2, 5, 5])` will return `2`<br>
`check([1, 2, 3, 4])` will return `4`<br>
Be aware, checking invalid input, like `check([0, 50, -1, 3])` will always return `0`