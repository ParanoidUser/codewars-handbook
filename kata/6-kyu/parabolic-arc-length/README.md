# [Parabolic Arc Length](https://www.codewars.com/kata/parabolic-arc-length "https://www.codewars.com/kata/562e274ceca15ca6e70000d3")

We want to approximate the length of a curve representing a function `y = f(x)` with  ` a<= x <= b`.
First, we split the interval `[a, b]` into n sub-intervals with widths 
<code>h<sub>1</sub>, h<sub>2</sub>, ... , h<sub>n</sub></code> 
by defining points 
<code>x<sub>1</sub>, x<sub>2</sub> , ... , x<sub>n-1</sub></code> between a and b. 
This defines points 
<code>P<sub>0</sub>, P<sub>1</sub>, P<sub>2</sub>, ... , P<sub>n</sub></code> on the curve 
whose x-coordinates are <code>a, x<sub>1</sub>, x<sub>2</sub> , ... , x<sub>n-1</sub>, b</code> 
and y-coordinates <code>f(a), f(x<sub>1</sub>), ..., f(x<sub>n-1</sub>), f(b) </code>. 
By connecting these points, we obtain a polygonal path approximating the curve.

Our task is to approximate the length of a parabolic arc representing the curve `y = x * x` with `x` in the interval `[0, 1]`. 
We will take a common step `h` between the points <code>x<sub>i</sub>: h<sub>1</sub>, h<sub>2</sub>, ... , h<sub>n</sub> = h = 1/n</code>
and we will consider the points 
<code>P<sub>0</sub>, P<sub>1</sub>, P<sub>2</sub>, ... , P<sub>n</sub></code> on the curve. 
The coordinates of each <code>P<sub>i</sub></code> are <code>(x<sub>i</sub>, y<sub>i</sub> = x<sub>i</sub> * x<sub>i</sub>)</code>.

The function `len_curve` (or similar in other languages) takes `n` as parameter (number of sub-intervals) and returns the length of the curve.
You can truncate it to **9** decimal places.

![alternative text](https://i.imgur.com/kyjJcE4.png)