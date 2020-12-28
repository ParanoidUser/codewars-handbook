# [Bonuses](https://www.codewars.com/kata/bonuses "https://www.codewars.com/kata/5d68d05e7a60ba002b0053f6")

John wants to give a total bonus of `$851` to his three employees taking *fairly as possible* into account their number of days of absence during the period under consideration.
Employee A was absent `18` days, B `15` days, and C `12` days.

**The more absences, the lower the bonus** ... 

How much should each employee receive?
John thinks A should receive `$230`, B `$276`, C `$345` since `230 * 18 = 276 * 15 = 345 * 12` and `230 + 276 + 345 = 851`.

## Task:

Given an array `arr` (numbers of days of absence for each employee) and a number `s` (total bonus) the function `bonus(arr, s)` will follow John's way and return an array of the *fair* bonuses of all employees in the same order as their numbers of days of absences.

`s` and all elements of `arr` are positive integers.

## Examples:

```
bonus([18, 15, 12], 851) -> [230, 276, 345]

bonus([30, 27, 8, 14, 7], 34067) -> [2772, 3080, 10395, 5940, 11880]
```

## Notes
- There are only integers in the kata so no need to use floats.
- See Example Test Cases for more examples.
- Please ask before translating: some translations are already written and published when/if the kata is approved.
- In the random tests the number of elements of `arr` can be big