# [Valid Parentheses](https://www.codewars.com/kata/valid-parentheses-1 "https://www.codewars.com/kata/6411b91a5e71b915d237332d")

Write a function that takes a string of parentheses, and determines if the order of the parentheses
is valid. The function should return `true` if the string is valid, and `false` if it's invalid.

## Examples

```
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true
```

## Constraints

`0 <= length of input <= 100`

- All inputs will be strings, consisting only of characters `(` and `)`.
- Empty strings are considered balanced (and therefore valid), and will be tested.
- For languages with mutable strings, the inputs should not be mutated.