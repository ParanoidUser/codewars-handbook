# [Compare powers](https://www.codewars.com/kata/compare-powers "https://www.codewars.com/kata/55b2549a781b5336c0000103")

You certainly can tell which is the larger number between 2<sup>10</sup> and 2<sup>15</sup>.

But what about, say, 2<sup>10</sup> and 3<sup>10</sup>? You know this one too.

Things tend to get a bit more complicated with **both** different bases and exponents: which is
larger between 3<sup>9</sup> and 5<sup>6</sup>?

Well, by now you have surely guessed that you have to build a function to compare powers, returning
-1 if the first member is larger, 0 if they are equal, 1 otherwise; powers to compare will be
provided in the `[base, exponent]` format:

```
comparePowers(new int[]{2, 10}, new int[]{2, 15}) ==  1;
comparePowers(new int[]{2, 10}, new int[]{3, 10}) ==  1;
comparePowers(new int[]{2, 10}, new int[]{2, 10}) ==  0;
comparePowers(new int[]{3,  9}, new int[]{5,  6}) == -1;
comparePowers(new int[]{7,  7}, new int[]{5,  8}) == -1;
```

Only positive integers will be tested, including bigger numbers - you are warned now, so be diligent
try to implement an efficient solution not to drain too much on CW resources ;)!