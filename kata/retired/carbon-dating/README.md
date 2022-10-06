# [Carbon Dating](https://www.codewars.com/kata/carbon-dating "https://www.codewars.com/kata/60515b599da73d0037c4c375")

We all remember those stupid carbon half-life problems we were given in math class. They always
seemed to be the hardest questions in my opinion. No? Just me? Very well :(. Anyways, Carbon dating
is actually very useful, especially in the field of archaeology. It allows researchers to learn the
ages of archaeological artifacts that were once living. It gives us insight into how old life on
Earth actually is, and that's pretty neat!

## Question

Given the initial amount of grams ```g``` and the years ```y```, calculate the amount of <sup>
14</sup>C remaining in a sample. One note that should be helpful on your journey is knowing that the
half-life of <sup>14</sup>C is 5700 years. <b>it must be rounded to two decimals places.</b>

## Example

```
dating(20,10320)->5.70
```

First, you must find the formula of decay for <sup>14</sup>C when its half-life is 5700 years. The
equation below shows you the general model for exponential decay.

<i>N</i>(<i>t</i>) = <i>N</i><sub>0</sub><i>e</i><sup><i>-kt</i></sup>

```t``` being time, ```N0``` being initial mass, and ```k``` being the rate of decay (which is what
you really need from this equation. hint hint).

Once you find that equation, just plug in the numbers given to you and solve! One thing to note is
that for the half life of carbon-14, I used 5,700 years (Yes, I know it's 5,730, but I rounded it to
make it a tad bit easier for ya.)