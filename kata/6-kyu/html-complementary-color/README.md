# [HTML Complementary Color](https://www.codewars.com/kata/html-complementary-color "https://www.codewars.com/kata/56be4affc5dc03b84b001d2d")

You have to implement the 

`get_reversed_color(hex_color)` (Python, Ruby, Haskell) 

or `getReversedColor(hexColor)` (JavaScript, Java) 

<img src="https://www.w3schools.com/colors/img_colormap.gif" align="right"></img>

function that takes a hex-color string and returns the string represents the complementary color.

What is the hex-color? You can find the answer on [w3schools](https://www.w3schools.com/colors/colors_picker.asp) and [Wikipedia](https://en.wikipedia.org/wiki/Web_colors)

## Input
It takes only one argument - string with hex value (case-ignored with chars 0..9 or A..F) without hash-char "#".
Argument `hex_color` is not necessarily with 6-digits length - rest of digits are filled by zeros: 
```
"a23" <=> "000a23"
"" <=> "0" <=> "000000"
```

## Output
Output is the upper-cased string contains of the hash character (#) and complementary color. Complementary color is some color which gives completely white color in sum with entered one:
`#000A23` + `#FFF5DC` = `#FFFFFF`

## Errors
If the entered string is incorrect: length is 7+, has non-hexadecimal characters or non-string type, then the Error(IllegalArgumentException - Java) should be raised/thrown or Nothing should be returned in Haskell.
```
>>> getReversedColor("00fffff")
Uncaught Error: Incorrect string length
>>> getReversedColor("00ffZZ")
Uncaught Error: Non-hex chars
>>> getReversedColor(112233)
Uncaught Error: Incorrect string type
```

## Examples
```
>>> getReversedColor("01fD08")
"#FE02F7"
>>> getReversedColor("")
"#FFFFFF"
>>> getReversedColor("a23")
"#FFF5DC"
```