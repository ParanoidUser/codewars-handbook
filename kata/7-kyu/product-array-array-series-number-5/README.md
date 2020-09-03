# [Product Array (Array Series #5)](https://www.codewars.com/kata/product-array-array-series-number-5 "https://www.codewars.com/kata/5a905c2157c562994900009d")

**_Given_** an *array/list [] of integers* , **_Construct_** a *product array **_Of same size_** Such That prod[i] is equal to The Product of all the elements of Arr[] except Arr[i]*. 

## Notes 

* **_Array/list_** size is *at least 2* .
* **_Array/list's numbers_**  Will be **_only Positives_** 
* **_Repetition_** of numbers in *the array/list could occur*.

## Input >> Output Examples 

```
productArray ({12,20}) ==>  return {20,12}
```

### **_Explanation_**:

* **_The first element_**  *in prod [] array* **_12_**  *is the product of all array's elements except the first element*
* **_The second element_** **_20_**  *is the product of all array's elements except the second element* .

```
productArray ({1,5,2}) ==> return {10,2,5}
```

### **_Explanation_**: 

* **_The first element_**  **_10_** *is the product of all array's elements* **_except_** *the first element **_1_***
* **_The second element_** **_2_** *is the product of all array's elements* **_except_** *the second element* **_5_** 
* **_The Third element_** **_5_** *is the product of all array's elements* **_except_** *the Third element* **_2_**.

```
productArray ({10,3,5,6,2}) return ==> {180,600,360,300,900}
```

### **_Explanation_**: 

* **_The first element_** **_180_**  *is the product of all array's elements* **_except_** *the first element*  **_10_** 
* **_The second element_** **_600_** *is the product of all array's elements*  **_except_**  *the second element*  **_3_** 
* **_The Third element_** **_360_** *is the product of all array's elements* **_except_** *the third element* **_5_**
* **_The Fourth element_** **_300_** *is the product of all array's elements* **_except_** *the fourth element* **_6_** 
* *Finally* ,**_The Fifth element_** **_900_** *is the product of all array's elements* **_except_** *the fifth element* **_2_** 