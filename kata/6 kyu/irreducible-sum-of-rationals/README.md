# [Irreducible Sum of Rationals](https://www.codewars.com/kata/irreducible-sum-of-rationals "https://www.codewars.com/kata/5517fcb0236c8826940003c9")

You will have a list of rationals in the form

```
lst = [ [numer_1, denom_1] , ... , [numer_n, denom_n] ]
```

where all numbers are positive integers. You have to produce their sum `N / D` in an irreducible form: this means that `N` and `D` have only `1` as a common divisor.

Return the result in the form: `"[N, D]"`

If the result is an integer (`D` evenly divides `N`) return: `"n"`
If the input list is empty, return `null`

### Example:

```
[ [1, 2], [1, 3], [1, 4] ]  -->  [13, 12]

    1/2  +  1/3  +  1/4     =      13/12
```

### Note
See sample tests for more examples and the form of results.