# [Divisible by 9?](https://www.codewars.com/kata/divisible-by-9 "https://www.codewars.com/kata/5f7b1a82be51af00105c82bd")

Given a non-negative integer number represented as a string, which can be arbitrary large.
Detect whether it is divisible by 9?


e.g
```
0 -> true  
7 -> false  
9 -> true  
18 -> true  
19 -> false  
777777777777777777777777777777777777777777777 -> true
```

Tips:
- All input strings in the tests are valid non-negative integer numbers, you don't have to check that.
- You'd better not use the arbitrary-precision data types from chosen programming languages, if any, to keep the kata fun :)
   - For `Java`, avoid `BigInteger` or `BigDecimal`.
   - For `Javascript`, avoid `BigInt`.
   - For `Python3`, since `int` has unbounded range, so avoid converting the whole input as a single `int` directly.
   - etc ...