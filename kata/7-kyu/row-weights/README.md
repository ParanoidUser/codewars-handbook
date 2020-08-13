# [Row Weights](https://www.codewars.com/kata/row-weights "https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9")

**_Several people_** are standing in *a row divided into two teams*.  
The **_first person_** goes into **_team 1_**, **_the second_** goes into **_team 2_**, **_the third_** goes into **_team 1_**, and so on.

## Task

**_Given_** *an array of positive integers (the weights of the people)*, **_return_** *a new array/tuple of two integers*, **_where_** **_the first_** one is the **_total weight of team 1_**, and **_the second_** one is the **_total weight of team 2_**.

## Notes 

* **_Array size_** is *at least 1*.
* **_All numbers_** will be **positive**.

## Input >> Output Examples 

```
rowWeights([13, 27, 49])  ==>  return (62, 27)
```

### **_Explanation_**:

**_The first element_** `62` is *the total weight of team 1*, and **_the second element_** `27` is *the total weight of team 2*.

```
rowWeights([50, 60, 70, 80])  ==>  return (120, 140)
```

### **_Explanation_**:

**_The first element_** `120` is *the total weight of team 1*, and **_the second element_** `140` is *the total weight of team 2*.

```
rowWeights([80])  ==>  return (80, 0)
```

### **_Explanation_**:

**_The first element_** `80` is *the total weight of team 1*, and **_the second element_** `0` is *the total weight of team 2*.