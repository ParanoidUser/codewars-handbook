# [Simple calculator ](https://www.codewars.com/kata/simple-calculator "https://www.codewars.com/kata/5810085c533d69f4980001cf")

You are required to create a simple calculator that returns the result of addition, subtraction, multiplication or division of two numbers.

Your function will accept three arguments:  
 - The first and second argument should be numbers.  
- The third argument should represent a sign indicating the operation to perform on these two numbers.

If the sign is not a valid sign, throw an IllegalArgumentException (Java) or ArgumentException (C#).

# Example:

```
arguments: 1, 2, "+"
should return 3

arguments: 1, 2, "&"
should throw an IllegalArgumentException (Java) or ArgumentException (C#)
```