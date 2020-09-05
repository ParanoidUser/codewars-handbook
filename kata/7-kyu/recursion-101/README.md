# [Recursion 101](https://www.codewars.com/kata/recursion-101 "https://www.codewars.com/kata/5b752a42b11814b09c00005d")

In this Kata, you will be given two positive integers `a` and `b` and your task will be to apply the following operations:

```
i) If a=0 or b=0, return [a,b]. Otherwise, go to step (ii);
ii) If a≥2*b, set a = a-2*b, and repeat step (i). Otherwise, go to step (iii);
iii) If b≥2*a, set b = b-2*a, and repeat step (i). Otherwise, return [a,b].
```

`a` and `b` will both be lower than 10E8.

More examples in tests cases.