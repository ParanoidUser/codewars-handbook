# [Circular List](https://www.codewars.com/kata/circular-list "https://www.codewars.com/kata/5b2e60742ae7543f9d00005d")

Create a Circular List

A circular list is of finite size, but can infinitely be asked for its previous and next elements. This is because it acts like it is joined at the ends and loops around.

For example, imagine a CircularList of `[1, 2, 3, 4]`. Five invocations of `next()` in a row should return 1, 2, 3, 4 and then 1 again. At this point, five invocations of `prev()` in a row should return 4, 3, 2, 1 and then 4 again.

Your CircularList is created by passing a varargs parameter in, e.g. `new CircularList(1, 2, 3)`. Your list constructor/init code should throw an Exception if nothing is passed in.


