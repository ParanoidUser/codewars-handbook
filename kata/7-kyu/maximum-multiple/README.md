# [Maximum Multiple](https://www.codewars.com/kata/maximum-multiple "https://www.codewars.com/kata/5aba780a6a176b029800041c")

**_Given_** a **_Divisor and a Bound_** , *Find the largest integer N* , Such That , 

## Conditions :

* **_N_**  is *divisible by divisor*
* **_N_**  is *less than or equal to bound* 
* **_N_**  is *greater than 0*.

## Notes 

* The **_parameters (divisor, bound)_** passed to the function are *only positive values* .
* *It's guaranteed that* a **divisor is Found** .

## Input >> Output Examples 

```
maxMultiple (2,7) ==> return (6)
```

### Explanation: 

**_(6)_** is divisible by **_(2)_** , **_(6)_** is less than or equal to bound **_(7)_** , and **_(6)_** is > 0 .

```
maxMultiple (10,50)  ==> return (50)
```

### Explanation:

**_(50)_** *is divisible by* **_(10)_** , **_(50)_** is less than or equal to bound **_(50)_** , and **_(50)_** is > 0 .*

```
maxMultiple (37,200) ==> return (185)
```

### Explanation:

**_(185)_** is divisible by **_(37)_** , **_(185)_** is less than or equal to bound **_(200)_** , and **_(185)_** is > 0 .

Java's default return statement can be any `int`, a divisor **will** be found.