# [String Calculator With Different Input Types](https://www.codewars.com/kata/string-calculator-with-different-input-types "https://www.codewars.com/kata/5886558141e0445dbf000086")

Write a calculator that calculates a sum of integers passed in a form of string.
It should return a sum represented as a string.

```
Example input: 
"1, 2, 3"
Example output: 
"6"
```

Also, there are two different invalid input types:

```
1. StringCalculatorFunctional.sum("") -> "Calculation failed"
2. StringCalculatorFunctional.sum("bad input") -> "Calculation failed"
```

If a string contains integers, but also an element which isn't an integer, sum should be calculated
from remaining numbers.

```
E.g.:
Input: "1, 2, bad input, 3"
Output: "6"
```

## Hints:

1. Develop a helper method with the following signature:
    ``` 
    private static Optional<Integer> parseIntHelper(String number);
    ```
2. Convert split string into a stream
3. Use map-reduce paradigm
4. APIs for use:
    * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
    * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
    * https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
