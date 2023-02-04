# [The observed PIN](https://www.codewars.com/kata/the-observed-pin "https://www.codewars.com/kata/5263c6999e0f40dee200059d")

Alright, detective, one of our colleagues successfully observed our target person, Robby the robber.
We followed him to a secret warehouse, where we assume to find all the stolen stuff. The door to
this warehouse is secured by an electronic combination lock. Unfortunately our spy isn't sure about
the PIN he saw, when Robby entered it.

The keypad has the following layout:

```
┌───┬───┬───┐
│ 1 │ 2 │ 3 │
├───┼───┼───┤
│ 4 │ 5 │ 6 │
├───┼───┼───┤
│ 7 │ 8 │ 9 │
└───┼───┼───┘
    │ 0 │
    └───┘
```

He noted the PIN `1357`, but he also said, it is possible that each of the digits he saw could
actually be another adjacent digit (horizontally or vertically, but not diagonally). E.g. instead of
the `1` it could also be the `2` or `4`. And instead of the `5` it could also be the `2`, `4`, `6`
or `8`.

He also mentioned, he knows this kind of locks. You can enter an unlimited amount of wrong PINs,
they never finally lock the system or sound the alarm. That's why we can try out all possible (*)
variations.

\* possible in sense of: the observed PIN itself and all variations considering the adjacent digits

Can you help us find all those variations? It would be nice to have a function, that returns an
array (or a list in Java/Kotlin and C#)  of all variations for an observed PIN with a length of 1 to
8 digits. We could name the function `getPINs` (`get_pins` in python, `GetPINs` in C#). But please
note that all PINs, the observed one and also the results, must be strings, because of potentially
leading '0's. We already prepared some test cases for you.

Detective, we are counting on you!