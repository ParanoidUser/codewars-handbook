# [Last digits of N^2 == N](https://www.codewars.com/kata/last-digits-of-n-2-equals-equals-n "https://www.codewars.com/kata/584dee06fe9c9aef810001e8")

This is a very simply formulated task. Let's call an integer number `N` 'green' if `N²` ends with all of the digits of `N`. Some examples:

`5` is green, because `5² = 25` and `25` ends with `5`.

`11` is not green, because `11² = 121` and `121` does not end with `11`.

`376` is green, because `376² = 141376` and `141376` ends with `376`.

Your task is to write a function `green` that returns `n`<sup>th</sup> green number, starting with `1` - `green (1) == 1`

---

## Data range

```
`n <= 5000` for Java
```