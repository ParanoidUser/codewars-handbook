# [Jumping  Number (Special Numbers Series  #4)](https://www.codewars.com/kata/jumping-number-special-numbers-series-number-4 "https://www.codewars.com/kata/5a54e796b3bfa8932c0000ed")

# Definition

**_Jumping number_** is the number that *All adjacent digits in it differ by 1*.

____

# Task

**_Given_** a number, **_Find if it is Jumping or not_** . 
____

# Notes 

* **_Number_** *passed is always*  **_Positive_** .

* **_Return_** *the result as* **_String_** . 

* **_The difference between_** *'9' and '0'* is **_not considered as 1_** . 

* **_All single digit numbers_** are considered as **_Jumping numbers_**. 
___

# Input >> Output Examples

```
jumpingNumber(9) ==> return "Jumping!!"
```
## **_Explanation_**:

* It's  **_single-digit number_** 
___

```
jumpingNumber(79) ==> return "Not!!"
```

## **_Explanation_**:

* *Adjacent digits* **_don't differ by 1_**
___

```
jumpingNumber(23) ==> return "Jumping!!"
```

## **_Explanation_**:

* *Adjacent digits* **_differ by 1_**
___

```
jumpingNumber(556847) ==> return "Not!!"
```

## **_Explanation_**:

* *Adjacent digits* **_don't differ by 1_**
___

```
jumpingNumber(4343456) ==> return "Jumping!!"
```

## **_Explanation_**:

* *Adjacent digits* **_differ by 1_**
___

```
jumpingNumber(89098) ==> return "Not!!"
```

## **_Explanation_**:

* *Adjacent digits* **_don't differ by 1_**
___

```
jumpingNumber(32) ==> return "Jumping!!"
```

## **_Explanation_**:

* *Adjacent digits* **_differ by 1_**