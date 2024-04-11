# [Colored Hexes!](https://www.codewars.com/kata/colored-hexes "https://www.codewars.com/kata/57e17750621bca9e6f00006f")

You're looking through different hex codes, and having trouble telling the difference
between <a href='http://www.colorhexa.com/000001'> #000001 </a> and <a href='http://www.colorhexa.com/100000'>
#100000 </a>

We need a way to tell which is red, and which is blue!

That's where you create  __hex color__ !!!

It should read an RGB input, and return whichever value (red, blue, or green) is of greatest concentration!

But, if multiple colors are of equal concentration, you should return their mix!

```
red + blue = magenta

green + red = yellow

blue + green = cyan

red + blue + green = white
```

One last thing, if the string given is empty, or has all 0's, return black!

Examples:

```
codes = "087 255 054" -> "green"
codes = "181 181 170" -> "yellow"
codes = "000 000 000" -> "black"
codes = "001 001 001" -> "white"
```