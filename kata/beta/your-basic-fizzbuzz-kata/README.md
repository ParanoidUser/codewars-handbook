# [Your Basic FizzBuzz kata](https://www.codewars.com/kata/your-basic-fizzbuzz-kata "https://www.codewars.com/kata/5560496dd9a642659300001a")

FizzBuzz is probably the second most popular way to introduce beginners to the art of coding (the first probably being the ancient Fibonacci sequence, the grandfather of all the algorithm theory).

In this very basic kata you will have to create a function that returns the same numbers that is given as a parameter, but with exceptions:

- If number doesn't divide evenly with `3` or `5` - return original input number
- If number divides evenly with `3` - returns string `"fizz"`
- If number divides evenly with `5` - returns string `"buzz"`
- If number divides evenly with `3` and `5` - returns string `"fizz buzz"`

Sample cases:
```
fizzbuzz(1).equals("1");
fizzbuzz(9).equals("fizz");
fizzbuzz(25).equals("buzz");
fizzbuzz(37).equals("37");
fizzbuzz(45).equals("fizz buzz");
fizzbuzz(139).equals("139");
```