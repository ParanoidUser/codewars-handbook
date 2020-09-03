# [Extra Perfect Numbers (Special Numbers Series #7)](https://www.codewars.com/kata/extra-perfect-numbers-special-numbers-series-number-7 "https://www.codewars.com/kata/5a662a02e626c54e87000123")

**_Extra perfect number_** *is the number that* **_first_** and **_last_** *bits* are **_set bits_**.

## Task

**_Given_**  *a positive integer*   `N` ,  **_Return_** the **_extra perfect numbers_** *in range from*  `1`  to  `N` .

## Notes 

* **_Number_** *passed is always*  **_Positive_** .
* **_Returned array/list_** should *contain the extra perfect numbers in ascending order*  **from lowest to highest**

## Input >> Output Examples

```
extraPerfect(3)  ==>  return {1,3}
```

### **_Explanation_**:

(1)<sub>10</sub> =(1)<sub>2</sub>

**First** and **last** bits as **_set bits_**.

(3)<sub>10</sub> = (11)<sub>2</sub>

**First** and **last** bits as **_set bits_**.

```
extraPerfect(7)  ==>  return {1,3,5,7}
```

### **_Explanation_**:

(5)<sub>10</sub> = (101)<sub>2</sub>

**First** and **last** bits as **_set bits_**.

(7)<sub>10</sub> = (111)<sub>2</sub>

**First** and **last** bits as **_set bits_**.