# [Simpson's Rule - Approximate Integration](https://www.codewars.com/kata/simpsons-rule-approximate-integration "https://www.codewars.com/kata/565abd876ed46506d600000d")

An integral:
  
<a href="http://www.codecogs.com/eqnedit.php?latex=\bg_white&space;\int_{a}^{b}f(x)dx" target="_blank"><img src="http://latex.codecogs.com/gif.latex?\bg_white&space;\int_{a}^{b}f(x)dx" title="\int_{a}^{b}f(x)dx" /></a>


can be approximated by the so-called Simpson’s rule:

<a href="http://www.codecogs.com/eqnedit.php?latex=\frac{b-a}{3n}(f(a)&plus;f(b)&plus;
    4\sum_{i=1}^{n/2}f(a&plus;(2i-1)h)&plus;2\sum_{i=1}^{n/2-1}f(a&plus;2ih))" target="_blank">
<img src="http://latex.codecogs.com/gif.latex?\bg_white&space;\frac{b-a}{3n}(f(a)&plus;f(b)&plus;4\sum_{i=1}^{n/2}f(a&plus;(2i-1)h)&plus;
    2\sum_{i=1}^{n/2-1}f(a&plus;2ih))" title="\frac{b-a}{3n}(f(a)+f(b)+4\sum_{i=1}^{n/2}f(a+(2i-1)h)+2\sum_{i=1}^{n/2-1}f(a+2ih))" /></a>

Here `h = (b-a)/n`, `n` being an even integer and `a <= b`. 
We want to try Simpson's rule with the function f:

<a href="http://www.codecogs.com/eqnedit.php?latex=f(x)&space;=&space;\frac{3}{2}sin^3x" 
target="_blank"><img src="http://latex.codecogs.com/gif.latex?\bg_white&space;f(x)&space;=&space;\frac{3}{2}sin^3x" title="f(x) = \frac{3}{2}sin^3x" /></a>

The task is to write a function called `simpson` with parameter `n` which returns the value of the integral of f 
on the interval 
<a href="http://www.codecogs.com/eqnedit.php?latex=\bg_white&space;\left&space;[&space;\right&space;0,\pi\left&space;\right&space;]" target="_blank"><img src="http://latex.codecogs.com/gif.latex?\bg_white&space;\left&space;[&space;\right&space;0,\pi\left&space;\right&space;]" title="\left [ \right 0,\pi\left \right ]" /></a>
.

## Notes:
- Don't round or truncate your results. See in "RUN EXAMPLES" the function `assertFuzzyEquals` or `testing`.
- `n` will always be even.
- We know that the exact value of the integral of f on the given interval is `2`.