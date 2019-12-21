# [Split By Value](https://www.codewars.com/kata/split-by-value "https://www.codewars.com/kata/5a433c7a8f27f23bb00000dc")

For an integer ```k``` rearrange all the elements of the given array in such way, that:

all elements that are less than ```k``` are placed before elements that are not less than ```k```;<br>
all elements that are less than ```k``` remain in the same order with respect to each other;<br>
all elements that are not less than ```k``` remain in the same order with respect to each other.<br>

For ```k = 6``` and ```elements = [6, 4, 10, 10, 6]```, the output should be
```splitByValue(k, elements) = [4, 6, 10, 10, 6]```.

For ```k``` = 5 and ```elements = [1, 3, 5, 7, 6, 4, 2]```, the output should be
```splitByValue(k, elements) = [1, 3, 4, 2, 5, 7, 6]```.