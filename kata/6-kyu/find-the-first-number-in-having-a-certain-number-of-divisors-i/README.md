# [Find the First Number in Having a Certain Number of Divisors I](https://www.codewars.com/kata/find-the-first-number-in-having-a-certain-number-of-divisors-i "https://www.codewars.com/kata/5612ab201830eb000f0000c0")

The number ```12``` is the first number in having six divisors, they are: ```1, 2, 3, 4, 6 and 12.```
Your challenge for this kata is to find the minimum number that has a certain number of divisors.
For this purpose we have to create the function 

```find_min_num() or findMinNum() or similar in the other languages```

that receives the wanted number of divisors ```num_div```, and outputs the smallest number having an amount of divisors equals to ```num_div```.

Let's see some cases:
```
find_min_num(10) = 48 # divisors are: 1, 2, 3, 4, 6, 8, 12, 16, 24 and  48
find_min_num(12) = 60
```
In this kata all the tests will be with ```numDiv < 80```