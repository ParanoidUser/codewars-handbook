# [TV Remote (wrap)](https://www.codewars.com/kata/tv-remote-wrap "https://www.codewars.com/kata/5b2c2c95b6989da552000120")

My TV remote control has arrow buttons and an `OK` button.

I can use these to move a "cursor" on a logical screen keyboard to type words...

## Keyboard

The screen "keyboard" layout looks like this

<style>
  #tvkb {
    width : 400px;
    border: 5px solid gray; border-collapse: collapse;
  }
  #tvkb td {
    color : orange;
    background-color : black;
    text-align : center;
    border: 3px solid gray; border-collapse: collapse;
  }
</style>

<table id = "tvkb">
<tr><td>a<td>b<td>c<td>d<td>e<td>1<td>2<td>3</tr>
<tr><td>f<td>g<td>h<td>i<td>j<td>4<td>5<td>6</tr>
<tr><td>k<td>l<td>m<td>n<td>o<td>7<td>8<td>9</tr>
<tr><td>p<td>q<td>r<td>s<td>t<td>.<td>@<td>0</tr>
<tr><td>u<td>v<td>w<td>x<td>y<td>z<td>_<td>/</tr>
<tr><td>aA<td>SP<td style="background-color: orange"><td style="background-color: orange"><td style="background-color: orange"><td style="background-color: orange"><td style="background-color: orange"><td style="background-color: orange"></tr>
</table>

* `aA` is the SHIFT key. Pressing this key toggles alpha characters between UPPERCASE and lowercase
* `SP` is the space character
* The other blank keys in the bottom row have no function

## Kata task

How many button presses on my remote are required to type the given `words`?

### Hint

This Kata is an extension of the earlier ones in this series. You should complete those first.

### Notes

* The cursor always starts on the letter `a` (top left)
* The alpha characters are initially lowercase (as shown above)
* Remember to also press `OK` to "accept" each letter
* Take the shortest route from one letter to the next
* <span style="color:red;">The cursor wraps,</span> so as it moves off one edge it will reappear on
  the opposite edge
* Although the blank keys have no function, you may navigate through them if you want to
* Spaces may occur anywhere in the `words` string
* Do not press the SHIFT key until you need to. For example, with the word `e.Z`, the SHIFT change
  happens **after** the `.` is pressed (not before)

## Example

words = `Code Wars`

* C => `a`-`aA`-OK-`A`-`B`-`C`-OK = 6
* o => `C`-`B`-`A`-`aA`-OK-`u`-`v`-`w`-`x`-`y`-`t`-`o`-OK = 12
* d => `o`-`j`-`e`-`d`-OK = 4
* e => `d`-`e`-OK = 2
* space => `e`-`d`-`c`-`b`-`SP`-OK = 5
* W => `SP`-`aA`-OK-`SP`-`V`-`W`-OK = 6
* a => `W`-`V`-`U`-`aA`-OK-`a`-OK = 6
* r => `a`-`f`-`k`-`p`-`q`-`r`-OK = 6
* s => `r`-`s`-OK = 2

Answer = 6 + 12 + 4 + 2 + 5 + 6 + 6 + 6 + 2 = 49