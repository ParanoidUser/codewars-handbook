# [Last digit of a large number](https://www.codewars.com/kata/last-digit-of-a-large-number "https://www.codewars.com/kata/5511b2f550906349a70004e1")

Define a function that takes in two non-negative integers `$a$` and `$b$` and returns the last
decimal digit of `$a^b$`. Note that `$a$` and `$b$` may be very large!

For example, the last decimal digit of `$9^7$` is `$9$`, since `$9^7 = 4782969$`. The last decimal
digit of `$({2^{200}})^{2^{300}}$`, which has over `$10^{92}$` decimal digits, is `$6$`. Also,
please take `$0^0$` to be `$1$`.

You may assume that the input will always be valid.

## Examples

```
lastDigit(new BigInteger("4"), new BigInteger("1")) // returns 4
lastDigit(new BigInteger("4"), new BigInteger("2")) // returns 6
lastDigit(new BigInteger("9"), new BigInteger("7")) // returns 9
lastDigit(new BigInteger("10"), new BigInteger("10000000000")) // returns 0
```