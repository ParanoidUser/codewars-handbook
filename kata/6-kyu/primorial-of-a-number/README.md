# [Primorial Of a Number](https://www.codewars.com/kata/primorial-of-a-number "https://www.codewars.com/kata/5a99a03e4a6b34bb3c000124")

*Is similar to factorial of a number*, **_In primorial_**, not all the natural numbers get multiplied, **_only prime numbers are multiplied to calculate the primorial of a number_**. It's denoted with **_P_**<sub>**_#_**</sub>.

## Task

**_Given_** *a number N* , **_calculate its primorial_**. ![!alt](https://i.imgur.com/mdX8dJP.png)  ![!alt](https://i.imgur.com/mdX8dJP.png)  

## Notes

* **_Only positive_** numbers *will be passed (N > 0)* .

## Input >> Output Examples:

``` 
1- numPrimorial (3) ==> return (30)
```

## **_Explanation_**:

**_Since_** *the passed number is (3)* ,**_Then_** **_the primorial_** *should obtained by multiplying*  ```2 * 3 * 5 = 30 .```

Mathematically written as , **_P_**<sub>3</sub>**_#_** = 30 .

```
2- numPrimorial (5) ==> return (2310)
```

## **_Explanation_**:


**_Since_** *the passed number is (5)* ,**_Then_** **_the primorial_** *should obtained by multiplying*  ``` 2 * 3 * 5 * 7 * 11 = 2310 .```

Mathematically written as , **_P_**<sub>5</sub>**_#_** = 2310 .

```
3- numPrimorial (6) ==> return (30030)
```

## **_Explanation_**: 

**_Since_** *the passed number is (6)* ,**_Then_** **_the primorial_** *should obtained by multiplying*  ``` 2 * 3 * 5 * 7 * 11 * 13 = 30030 .```

Mathematically written as , **_P_**<sub>6</sub>**_#_** = 30030 .