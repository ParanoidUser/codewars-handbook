# [Loneliest character](https://www.codewars.com/kata/loneliest-character "https://www.codewars.com/kata/5f885fa9f130ea00207c7dc8")

Complete the function which accepts a string and return an array of character(s) that have the most
spaces to their right and left.

**Notes:**

* the string can have leading/trailing spaces - you **should not** count them
* the strings contain only unique characters from `a` to `z`
* the order of characters in the returned array doesn't matter

## Examples

```
"a b  c"                        -->  ["b"]
"a bcs           d k"           -->  ["d"]
"    a b  sc     p     t   k"   -->  ["p"]
"a  b  c  de"                   -->  ["b", "c"]
"     a  b  c de        "       -->  ["b"]
"abc"                           -->  ["a", "b", "c"]
```