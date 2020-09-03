# [Parts of a list](https://www.codewars.com/kata/parts-of-a-list "https://www.codewars.com/kata/56f3a1e899b386da78000732")

Write a function `partlist` that gives all the ways to divide a list (an array) of
at least two elements into two non-empty parts.

- Each two non empty parts will be in a pair (or an array for languages without tuples or a `struct`in C - C: see Examples test Cases - ) 
- Each part will be in a string
- Elements of a pair must be in the same order as in the original array.

## Examples: 

`a = ["az", "toto", "picaro", "zone", "kiwi"]` -->

`[["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]`
 
 or
 
 `a = {"az", "toto", "picaro", "zone", "kiwi"}` -->

`{{"az", "toto picaro zone kiwi"}, {"az toto", "picaro zone kiwi"}, {"az toto picaro", "zone kiwi"}, {"az toto picaro zone", "kiwi"}}`

or
 
`a = ["az", "toto", "picaro", "zone", "kiwi"]` -->

`[("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]`

or 

`a = [|"az", "toto", "picaro", "zone", "kiwi"|]` -->

`[("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]`
 
 
 or
 
`a = ["az", "toto", "picaro", "zone", "kiwi"]` -->

`"(az, toto picaro zone kiwi)(az toto, picaro zone kiwi)(az toto picaro, zone kiwi)(az toto picaro zone, kiwi)"`

You can see other examples for each language in "Your test cases"