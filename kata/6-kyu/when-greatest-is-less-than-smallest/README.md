# [When greatest is less than smallest](https://www.codewars.com/kata/when-greatest-is-less-than-smallest "https://www.codewars.com/kata/55f2a1c2cb3c95af75000045")

Given an `x` and `y` find the smallest and greatest numbers **above** and **below** a given `n` that are divisible by both `x` and `y`.

## Examples

```
GreatestSmallest.greatest(new BigInteger("2"), new BigInteger("3"), new BigInteger("20")) => BigInteger("18") // 18 is the greatest number under 20 that is divisible by both 2 and 3
GreatestSmallest.greatest(new BigInteger("2"), new BigInteger("3"), new BigInteger("20")) => BigInteger("24") // 24 is the smallest number above 20 that is divisible by both 2 and 3

GreatestSmallest.greatest(new BigInteger("5"), new BigInteger("15"), new BigInteger("100")) => BigInteger("90")
GreatestSmallest.smallest(new BigInteger("5"), new BigInteger("15"), new BigInteger("100")) => BigInteger("105")

GreatestSmallest.greatest(new BigInteger("123"), new BigInteger("456"), new BigInteger("789")) => BigInteger("0") // there are no numbers under 789 that are divisible by both 123 and 456
GreatestSmallest.smallest(new BigInteger("123"), new BigInteger("456"), new BigInteger("789")) => BigInteger("18696")
```

## Notes

1. you should never return `n` even if it is divisible by `x` and `y` always the number above or below it
2. `greatest` should return 0 if there are no numbers under `n` that are divisible by both `x` and `y`
3. and all arguments will be valid (integers greater than 0).