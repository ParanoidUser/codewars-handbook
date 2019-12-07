# [STRONGN  Strong Number (Special Numbers Series #2)  ](https://www.codewars.com/kata/strongn-strong-number-special-numbers-series-number-2 "https://www.codewars.com/kata/5a4d303f880385399b000001")

# Definition

**_Strong number_** is the number that *the sum of the factorial of its digits is equal to number itself*.

## **_For example_**:  **_145_**, since 
```
1! + 4! + 5! = 1 + 24 + 120 = 145
```
So, **_145_** is a **_Strong number_**. 
____

# Task

**_Given_** a number, **_Find if it is Strong or not_**.
____

# Notes 

* **_Number_** *passed is always*  **_Positive_**.
* **_Return_** *the result as* **_String_**
___

# Input >> Output Examples


```
strong_num(1) ==> return "STRONG!!!!"
```

## **_Explanation_**:

Since , **_the sum of its digits' factorial of (1) is equal to number itself (1)_** , **_Then_** its a **_Strong_** .  
____

```
strong_num(123) ==> return "Not Strong !!"
```

## **_Explanation_**:

Since **_the sum of its digits' factorial of 1! + 2! + 3! = 9 is not equal to number itself (123)_** , **_Then_** it's  **_Not Strong_** . 
___

```
strong_num(2)  ==>  return "STRONG!!!!"
```

## **_Explanation_**:

Since **_the sum of its digits' factorial of 2! = 2 is equal to number itself (2)_** , **_Then_** its a **_Strong_** .  
____

```
strong_num(150) ==> return "Not Strong !!"
```

## **_Explanation_**:

Since **_the sum of its digits' factorial of 1! + 5! + 0! = 122 is not equal to number itself (150)_**, **_Then_** it's **_Not Strong_** . 