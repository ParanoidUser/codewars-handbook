# [Moves in squared strings (II)](https://www.codewars.com/kata/moves-in-squared-strings-ii "https://www.codewars.com/kata/56dbe7f113c2f63570000b86")

You are given a string of `n` lines, each substring being `n` characters long: For example:

`s = "abcd\nefgh\nijkl\nmnop"`

We will study some transformations of this square of strings.

- Clock rotation 180 degrees: rot
```
rot(s) => "ponm\nlkji\nhgfe\ndcba"
```
- selfie_and_rot(s) (or selfieAndRot or selfie-and-rot)
It is initial string + string obtained by clock rotation 180 degrees with dots interspersed in order (hopefully) to better show the rotation when printed.
```
s = "abcd\nefgh\nijkl\nmnop" --> 
"abcd....\nefgh....\nijkl....\nmnop....\n....ponm\n....lkji\n....hgfe\n....dcba"
```
or printed:

```
|rotation        |selfie_and_rot
|abcd --> ponm   |abcd --> abcd....
|efgh     lkji   |efgh     efgh....
|ijkl     hgfe   |ijkl     ijkl....   
|mnop     dcba   |mnop     mnop....
                           ....ponm
                           ....lkji
                           ....hgfe
                           ....dcba
```
## Task

- Write these two functions `rot`and `selfie_and_rot`

and

- high-order function `oper(fct, s)` where

 - fct is the function of one variable f to apply to the string `s`
(fct will be one of `rot, selfie_and_rot`)

## Example

```
s = "abcd\nefgh\nijkl\nmnop"
oper(rot, s) => "ponm\nlkji\nhgfe\ndcba"
oper(selfie_and_rot, s) => "abcd....\nefgh....\nijkl....\nmnop....\n....ponm\n....lkji\n....hgfe\n....dcba"
```

## Note
- The form of the parameter `fct` in oper
changes according to the language. You can see each form according to the language in "Your test cases".
- It could be easier to take these katas from number (I) to number (IV)

Forthcoming katas will study other tranformations.