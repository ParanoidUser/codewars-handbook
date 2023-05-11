# [PhoneWords](https://www.codewars.com/kata/phonewords-1 "https://www.codewars.com/kata/635b8fa500fba2bef9189473")

Given a string of numbers, you must perform a method in which you will translate this string into text, based on the
below image:

![](https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/1024px-Telephone-keypad2.svg.png)

For example if you get `"22"` return `"b"`, if you get `"222"` you will return `"c"`. If you get `"2222"` return `"ca"`.

Further details:

- `0` is a space in the string.
- `1` is used to separate letters with the same number.
- always transform the number to the letter with the maximum value, as long as it does not have a `1` in the middle.
  So, `"777777" -->  "sq"` and `"7717777" --> "qs"`.
- you cannot return digits.
- Given an empty string, return empty string.
- Return a lowercase string.

## Examples:

```
"443355555566604466690277733099966688" -->  "hello how are you"
"55282" -->  "kata"
"22266631339277717777" -->  "codewars"
"66885551555" -->  "null"
"833998" -->  "text"
"000" -->  "   "
```