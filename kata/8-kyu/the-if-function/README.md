# [The 'if' function](https://www.codewars.com/kata/the-if-function "https://www.codewars.com/kata/54147087d5c2ebe4f1000805")

Create a function called `_if` which takes 3 arguments: a value `bool` and 2 functions (which do not take any
parameters): `func1` and `func2`

When `bool` is truthy, `func1` should be called, otherwise call the `func2`.

### Example:

```
Kata._if(true, () -> System.out.println("true"), () -> System.out.println("false"));
// prints "true" to the System out.
```