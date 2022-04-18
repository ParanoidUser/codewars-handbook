# [Is Sator Square?](https://www.codewars.com/kata/is-sator-square "https://www.codewars.com/kata/5cb7baa989b1c50014a53333")

## A Discovery

One fine day while ploughing the fields, Farmer Arepo found a stone tablet with symbols carved on
it... he knew such artifacts may _show a message in four directions_, so he wisely kept it and
resumed turning the soil. He found more tablets, but with crops to sow he had no time to decipher
them.

## Your Task

Please help Farmer Arepo by inspecting each tablet to discern whether or not it shows
a <a href="https://en.wikipedia.org/wiki/Sator_Square">Sator Square</a>!

## The Square

* is a two-dimensional palindrome (made from words of equal length)
* observes four symmetries: identity, 180-degree rotation, and two diagonal reflections
* can be read:
    - left-to-right (across)
    - top-to-bottom (down)
    - bottom-to-top (up)
    - right-to-left (reverse)
* can be rotated 180 degrees and all words still read in all directions

* is exemplified here in how to read a word (`"TUBA"`) in the four ways:

<pre style='background:black'>
                         down
                          v
           B A T S    B A <span style='color:green'>T</span> S    B <span style='color:green'>A</span> T S    B A T S
           A B U T    A B <span style='color:green'>U</span> T    A <span style='color:green'>B</span> U T    <span style='color:green'>A B U T</span> < reverse
  across > <span style='color:green'>T U B A</span>    T U <span style='color:green'>B</span> A    T <span style='color:green'>U</span> B A    T U B A
           S T A B    S T <span style='color:green'>A</span> B    S <span style='color:green'>T</span> A B    S T A B
                                   ^
                                   up
</pre>

## Some Details

* tablet (square) dimensions range from `2x2` to `33x33` inclusive
* characters range from ascii ordinals `33` to `126` inclusive
* tablets may contain characters that look similar yet are different
* you are not permitted to mutate the input

## Input

```
public static Boolean isSatorSquare(char[][] tablet) {
  //  a two-dimentional array of characters (2 <= n <= 33)
}
```

## Output

```
true or false  //  whether or not the tablet is a sator square
```