# [Find the X from Equation](https://www.codewars.com/kata/find-the-x-from-equation "https://www.codewars.com/kata/5a78515c0136a1bf3e000047")

Given String `s` in the form of equation.<br>
Your task is to parse the `s` string and find the `"X"` value from string.

<b>Example:</b><br>
For `s = "99X=1(mod 8)"`, the output should be<br>
`findIt(s) = 3`.<br>

`s = "99X=1(mod 8)"`.<br>
To solve this equation, first you must reduce the left side.<br>
Make it as small as possible without being negative by decreasing it by mod.<br>
So,for example `99X` would reduce to `3x`.<br>

Now your expression should look like this:<br>
`3X=1(mod 8)`.<br>
Now that the left side is done, we switch focus to the right side.<br>
If we mod by `8`, we can safely `add` or `subtract` `8` to get the same answer, so we `add` `8` to the number on the right until we get a number `evenly divisible by the left number`.<br>
So `3X=1(mod 8)`, goes to `3x=9(mod 8)`.<br>

`9` is evenly divided by `3`, so we stop there. Our final step is to isolate `X`, so we divide `9` by `3` leaving us with `X=3`.

<b>If there no result, return </b>`-1` <b>instead.</b>

`s = "145X=1(mod 10)"`
We take the 145X, 145 can be reduced to `5`, so your equation form now is `5X=1(mod 10)`.<br>
but, there no valid equation because `1+10 = 11 + 10 = 21 + 10 = 31`... etc, we will not get number that can be divided by `5`.