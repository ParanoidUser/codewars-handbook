# [simple calculator ](https://www.codewars.com/kata/simple-calculator "https://www.codewars.com/kata/5810085c533d69f4980001cf")

You are required to create a simple calculator that returns the result of addition, subtraction, multiplication or division of two numbers.

Your function will accept three arguments:<br>
The first and second argument should be numbers.<br>
The third argument should represent a sign indicating the operation to perform on these two numbers.
```if-not:csharp,java
if the variables are not numbers or the sign does not belong to the list above a message "unknown value" must be returned.
```
```if:csharp,java
If the sign is not a valid sign, throw an IllegalArgumentException (Java) or ArgumentException (C#).
```

# Example:

~~~if-not:csharp,java
```
arguments: 1, 2, "+"
should return 3

arguments: 1, 2, "&"
should return "unknown value"

arguments: 1, "k", "*"
should return "unknown value"
```
~~~
~~~if:csharp,java
```
arguments: 1, 2, "+"
should return 3

arguments: 1, 2, "&"
should throw an IllegalArgumentException (Java) or ArgumentException (C#)
```
~~~

Good luck!
