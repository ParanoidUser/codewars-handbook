# [Padovan numbers](https://www.codewars.com/kata/padovan-numbers "https://www.codewars.com/kata/5803ee0ed5438edcc9000087")

The [Padovan sequence](https://en.wikipedia.org/wiki/Padovan_sequence) is the sequence of integers
defined by the initial values

```
P(0) = P(1) = P(2) = 1
```

and the recurrence relation

```
P(n) = P(n-2) + P(n-3)
```

The first few values of `P(n)` are:

```
1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114, 151, 200, 265, ...
```

## Task

Your task is to write a method that returns `n`th Padovan number