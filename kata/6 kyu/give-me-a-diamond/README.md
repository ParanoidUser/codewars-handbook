# [Give me a Diamond](https://www.codewars.com/kata/give-me-a-diamond "https://www.codewars.com/kata/5503013e34137eeeaa001648")

Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James. Since James doesn't know how to make this happen, he needs your help.

## Task

You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (`*`) characters. Trailing spaces should be removed, and every line must be terminated with a newline character (`\n`).

Return `null/nil/None/...` if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.


## Examples

A size 3 diamond:

```
 *
***
 *
```

...which would appear as a string of `" *\n***\n *\n"`


A size 5 diamond:

```
  *
 ***
*****
 ***
  *
```

...that is: `"  *\n ***\n*****\n ***\n  *\n"`
