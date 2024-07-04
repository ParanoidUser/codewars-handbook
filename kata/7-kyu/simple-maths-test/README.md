# [Simple Maths Test](https://www.codewars.com/kata/simple-maths-test "https://www.codewars.com/kata/5507309481b8bd3b7e001638")

Create a function which checks a number for three different properties.

- is the number prime?
- is the number even?
- is the number a multiple of 10?

Each should return either true or false, which should be given as an array.

### Examples

```
SimpleMath.numberProperty(7)  => new boolean[] {true, false, false}
SimpleMath.numberProperty(10) => new boolean[] {false, true, true}
```

The number will always be an integer, either positive or negative. Note that negative numbers cannot be primes, but
they can be multiples of 10:

```
SimpleMath.numberProperty(-7)  => new boolean[] {false, false, false}
SimpleMath.numberProperty(-10) => new boolean[] {false, true, true}
```