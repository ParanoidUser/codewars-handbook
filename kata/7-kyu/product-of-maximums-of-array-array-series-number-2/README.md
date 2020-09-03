# [Product Of Maximums Of Array (Array Series #2)](https://www.codewars.com/kata/product-of-maximums-of-array-array-series-number-2 "https://www.codewars.com/kata/5a63948acadebff56f000018")

**_Given_** an *array/list [] of integers* , **_Find the product of the k maximal_** numbers.

## Notes 

* **_Array/list_** size is *at least 3* .
* **_Array/list's numbers_**  *Will be* **_mixture of positives , negatives and zeros_** 
* **_Repetition_** of numbers in *the array/list could occur*.

## Input >> Output Examples 

```
maxProduct ({4, 3, 5}, 2) ==>  return (20)
```

### **_Explanation_**:

* **_Since_** *the size (k) equal 2* , then **_the subsequence of size 2_** *whose gives* **_product of maxima_**  is `5 * 4 = 20` .

```
maxProduct ({8, 10 , 9, 7}, 3) ==>  return (720)
```

### **_Explanation_**:

* **_Since_** *the size (k) equal 3* , then **_the subsequence of size 2_** *whose gives* **_product of maxima_**  is ` 8 * 9 * 10 = 720` .

```
maxProduct ({10, 8, 3, 2, 1, 4, 10}, 5) ==> return (9600)
```

### **_Explanation_**: 

* **_Since_** *the size (k) equal 5* , then **_the subsequence of size 2_** *whose gives* **_product of maxima_**  is ` 10 * 10 * 8 * 4 * 3 = 9600` .

```
maxProduct ({-4, -27, -15, -6, -1}, 2) ==> return (4)
```

### **_Explanation_**:

* **_Since_** *the size (k) equal 2* , then **_the subsequence of size 2_** *whose gives* **_product of maxima_**  is ` -4 * -1 = 4` .

```
maxProduct ({10, 3, -1, -27} , 3)  return (-30)
``` 

### **_Explanation_**:

* **_Since_** *the size (k) equal 3* , then **_the subsequence of size 2_** *whose gives* **_product of maxima_**  is ` 10 * 3 * -1 = -30 ` .