# [Simple missing sum](https://www.codewars.com/kata/simple-missing-sum "https://www.codewars.com/kata/5a941f3a4a6b34edf900006f")

In this Kata, we will calculate the **minimum positive number that is not a possible sum** from a list of positive integers. 

```
solve([1,2,8,7]) = 4 => we can get 1, 2, 3 (from 1+2), but we cannot get 4. 4 is the minimum number not possible from the list. 
solve([4,1,2,3,12]) = 11. We can get 1, 2, 3, 4, 4+1=5, 4+2=6,4+3=7,4+3+1=8,4+3+2=9,4+3+2+1=10. But not 11. 
solve([2,3,2,3,4,2,12,3]) = 1. We cannot get 1.
```

More examples in test cases.