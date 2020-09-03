# [Square Root of 2](https://www.codewars.com/kata/square-root-of-2 "https://www.codewars.com/kata/589120e0be9501aac8000072")

The method of periodic continued fractions is one of the many ways to calculate the square root of a natural number. This method uses as denominator a repetition for fractions. This repetition can be done by a fixed number of times.

For example, by repeating 2 times the continued fraction to calculate the square root of 2, we have the following equation.

<a href="https://www.codecogs.com/eqnedit.php?latex=\bg_green&space;\sqrt&space;2&space;\approx&space;1&space;&plus;&space;\frac{1}{2&space;&plus;&space;\frac&space;{1}{2}}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\bg_green&space;\sqrt&space;2&space;\approx&space;1&space;&plus;&space;\frac{1}{2&space;&plus;&space;\frac&space;{1}{2}}" title="\sqrt 2 \approx 1 + \frac{1}{2 + \frac {1}{2}}" /></a>

## Input

The input is a natural number n (0 ≤ n ≤ 1000) that indicates the quantity of denominator repetitions in the continued fraction.

## Output

The output is the approximate value of the square root with 10 decimal places.

## Examples
```
calculate(0) => 1.0000000000`
calculate(1) => 1.5000000000
calculate(5) => 1.4142857143
```

## Notes

https://en.wikipedia.org/wiki/Periodic_continued_fraction