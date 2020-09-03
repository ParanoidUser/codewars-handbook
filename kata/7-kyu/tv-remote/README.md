# [TV Remote](https://www.codewars.com/kata/tv-remote "https://www.codewars.com/kata/5a5032f4fd56cb958e00007a")

My TV remote control has arrow buttons and an `OK` button.

I can use these to move a "cursor" on a logical screen keyboard to type "words"...

The screen "keyboard" layout looks like this

<table>
<tr><td>a<td>b<td>c<td>d<td>e<td>1<td>2<td>3</tr>
<tr><td>f<td>g<td>h<td>i<td>j<td>4<td>5<td>6</tr>
<tr><td>k<td>l<td>m<td>n<td>o<td>7<td>8<td>9</tr>
<tr><td>p<td>q<td>r<td>s<td>t<td>.<td>@<td>0</tr>
<tr><td>u<td>v<td>w<td>x<td>y<td>z<td>_<td>/</tr>
</table>

## Task

How many button presses on my remote are required to type a given `word`?

## Notes

* The cursor always starts on the letter `a` (top left)
* Remember to also press `OK` to "accept" each character.
* Take a direct route from one character to the next
* The cursor does not wrap (e.g. you cannot leave one edge and reappear on the opposite edge)
* A "word" (for the purpose of this Kata) is any sequence of characters available on my virtual "keyboard" 

## Example

word = `codewars`

* c => `a`-`b`-`c`-OK = 3
* o => `c`-`d`-`e`-`j`-`o`-OK = 5
* d => `o`-`j`-`e`-`d`-OK = 4
* e => `d`-`e`-OK = 2
* w => `e`-`j`-`o`-`t`-`y`-`x`-`w`-OK = 7
* a => `w`-`r`-`m`-`h`-`c`-`b`-`a`-OK = 7
* r => `a`-`f`-`k`-`p`-`q`-`r`-OK = 6
* s => `r`-`s`-OK = 2

Answer = 3 + 5 + 4 + 2 + 7 + 7 + 6 + 2 = 36