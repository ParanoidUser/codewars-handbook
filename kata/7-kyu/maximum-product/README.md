# [Maximum Product](https://www.codewars.com/kata/maximum-product "https://www.codewars.com/kata/5a4138acf28b82aa43000117")

**_Given_** *an array of integers* , **_Find_** **_the maximum product_** *obtained from multiplying 2 adjacent numbers in the array*.

## Notes

* **_Array/list_** size is *at least 2*.
* **_Array/list_** numbers could be a *mixture of positives, negatives also zeroes* .

## Input >> Output Examples

```
adjacentElementsProduct([1, 2, 3]); ==> return 6
```

### **_Explanation_**:

* **_The maximum product_** *obtained from multiplying* ` 2 * 3 = 6 `, and **_they're adjacent numbers in the array_**.

```
adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]); ==> return 50
```

### **_Explanation_**:

**_Max product_** obtained *from multiplying*   ``` 5 * 10  =  50  ```.

```
adjacentElementsProduct([-23, 4, -5, 99, -27, 329, -2, 7, -921])  ==>  return -14
```

### **_Explanation_**:

* **_The maximum product_** *obtained from multiplying* ` -2 * 7 = -14 `, and **_they're adjacent numbers in the array_**.