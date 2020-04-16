# [Integer Primitive Data Types](https://www.codewars.com/kata/integer-primitive-data-types "https://www.codewars.com/kata/557810cf791bbfd5ff00008f")

Java supports different integer primitive data types. Each type has an individual range:

* byte: 8-bit signed two's complement integer
* short: 16-bit signed two's complement integer
* int: 32-bit signed two's complement integer
* long: 64-bit signed two's complement integer

We have got a huge list of integer-strings and we want to categorize all of them. Find the smallest possible data type of the enumeration for a given integer.

To solve it, complete the following method:

```
determineType(x)
```

* **input**: string
* **output**: your chosen primitive type
* all inputs are valid
* return "none" if no type fits
