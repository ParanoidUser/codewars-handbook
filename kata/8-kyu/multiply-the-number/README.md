# [Multiply the number](https://www.codewars.com/kata/multiply-the-number "https://www.codewars.com/kata/5708f682c69b48047b000e07")

Jack really likes his number five: the trick here is that you have to multiply each number by 5 raised to the number of
digits of each number, so, for example:

```
Kata.multiply(3) == 15      // 3 * 5¹
Kata.multiply(10) == 250    // 10 * 5²
Kata.multiply(200) == 25000 // 200 * 5³
Kata.multiply(0) == 0       // 0 * 5¹
Kata.multiply(-3) == -15    // -3 * 5¹
```