# [Special Number (Special Numbers Series #5)](https://www.codewars.com/kata/special-number-special-numbers-series-number-5 "https://www.codewars.com/kata/5a55f04be6be383a50000187")

A number is a **_Special Number_** *if it's digits only consist 0, 1, 2, 3, 4 or 5*

**_Given_** a number *determine if it special number or not* .  

## Notes 

* **_The number_** passed will be **_positive_** (N > 0) .
* All **single-digit numbers** with in the interval **_[0:5]_** are considered as **_special number_**. 

## Input >> Output Examples

```
specialNumber(2) ==> return "Special!!"
```

### Explanation: 

It's **_a single-digit number_** within the interval **_[0:5]_** . 

```
specialNumber(9) ==> return "NOT!!"
```

### Explanation:

Although, it's a single-digit number but **_Outside the interval [0:5]_** .

```
specialNumber(23) ==> return "Special!!"
```

### Explanation: 

All **_the number's digits_** formed from the interval **_[0:5]_** digits .

```
specialNumber(39) ==> return "NOT!!"
```

### Explanation: 

Although, *there is a digit (3) Within the interval* **_But_** **_the second digit is not (Must be ALL The Number's Digits )_** .

```
specialNumber(59) ==> return "NOT!!"
```

### Explanation:  

Although, *there is a digit (5) Within the interval* **_But_** **_the second digit is not (Must be ALL The Number's Digits )_** .

```
specialNumber(513) ==> return "Special!!"
```

```
specialNumber(709) ==> return "NOT!!"
```