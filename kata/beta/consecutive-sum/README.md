# [Consecutive Sum](https://www.codewars.com/kata/consecutive-sum "https://www.codewars.com/kata/5f120a13e63b6a0016f1c9d5")

Let's say we have a number, `num`. Find the number of values of `n` such that: there exists `n` consecutive **positive** values that sum up to `num`. A positive number is `> 0`. `n` can also be 1.

```
//Examples
int num = 1;
//1
return 1;

int num = 15;
//15, (7, 8), (4, 5, 6), (1, 2, 3, 4, 5)
return 4;

int num = 48;
//48, (15, 16, 17)
return 2;

int num = 97;
//97, (48, 49)
return 2;
```
The upper limit is `$10^8$`