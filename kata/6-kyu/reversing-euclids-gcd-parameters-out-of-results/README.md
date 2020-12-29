# [Reversing Euclid's GCD. Parameters out of results](https://www.codewars.com/kata/reversing-euclids-gcd-parameters-out-of-results "https://www.codewars.com/kata/58cd7f6914e656400100005a")

Your main goal is to find two numbers(` >= 0 `), the greatest common divisor of which will be `divisor` and number of iterations, taken by Euclid's algorithm will be `iterations`.

## Euclid's GCD

```
BigInteger FindGCD(BigInteger a, BigInteger b) {
  // Swaping `a` and `b`
  if (a < b) {
    a += b;
    b = a - b;
    a = a - b;
  }
  
  while (b > 0) {
    // Iteration of calculation
    BigInteger c = a % b;
    a = b;
    b = c;
  }
  
  // `a` - is greates common divisor now
  return a;
}
```

## Restrictions

Your program should work with numbers

`0 < divisor < 1000`

`0 <= iterations <= 50'000`