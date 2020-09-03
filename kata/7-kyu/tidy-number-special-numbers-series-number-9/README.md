# [Tidy Number (Special Numbers Series #9)](https://www.codewars.com/kata/tidy-number-special-numbers-series-number-9 "https://www.codewars.com/kata/5a87449ab1710171300000fd")

A **_Tidy number_**  *is a number whose*  **_digits are in non-decreasing order_**.

## Task

**_Given_** a number, **_Find if it is Tidy or not_** . 

## Notes 

* **_Number_** *passed is always*  **_Positive_** .
* **_Return_** *the result as* a **_Boolean_** 

## Input >> Output Examples

```
tidyNumber (12) ==> return (true)
```

### **_Explanation_**:

**_The number's digits_**    `{ 1 , 2 }`  are *in non-Decreasing Order* (i.e) *1 <= 2* .

```
tidyNumber (32) ==> return (false)
```

### **_Explanation_**:

**_The Number's Digits_**  `{ 3, 2}`  are **_not in non-Decreasing Order_** (i.e) *3 > 2* .

```
tidyNumber (1024) ==> return (false)
```

### **_Explanation_**:

**_The Number's Digits_**  `{1 , 0, 2, 4}`  are **_not in non-Decreasing Order_**  as  *0 <= 1* .

```
tidyNumber (13579) ==> return (true)
```

### **_Explanation_**:

**_The number's digits_**    `{1 , 3, 5, 7, 9}`  are *in non-Decreasing Order* .

```
tidyNumber (2335) ==> return (true)
```

### **_Explanation_**:

**_The number's digits_**    `{2 , 3, 3, 5}`  are *in non-Decreasing Order* , **_Note_**   *3 <= 3* 