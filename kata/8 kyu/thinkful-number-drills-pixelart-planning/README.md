# [Thinkful - Number Drills: Pixelart planning](https://www.codewars.com/kata/thinkful-number-drills-pixelart-planning "https://www.codewars.com/kata/58630e2ae88af44d2b0000ea")

You're laying out a rad pixel art mural to paint on your living room wall in homage to [Paul Robertson](http://68.media.tumblr.com/0f55f7f3789a354cfcda7c2a64f501d1/tumblr_o7eq3biK9s1qhccbco1_500.png), your favorite pixel artist.

You want your work to be perfect down to the millimeter. You haven't decided on the dimensions of your piece, how large you want your pixels to be, or which wall you want to use. You just know that you want to fit an exact number of pixels.

To help decide those things you've decided to write a function, `is_divisible()` that will tell you whether a wall of a certain length can exactly fit an integer number of pixels of a certain length.

Your function should take two arguments: the size of the wall in millimeters and the size of a pixel in millimeters. It should return `True` if you can fit an exact number of pixels on the wall, otherwise it should return `False`. For example `is_divisible(4050, 27)` should return `True`, but `is_divisible(4066, 27)` should return `False`.

Note: you don't need to use an `if` statement here. Remember that in Python an expression using the `==` comparison operator will evaluate to either `True` or `False`:
```
>>> def equals_three(num):
>>>     return num == 3
>>> equals_three(5)
False
>>> equals_three(3)
True
```