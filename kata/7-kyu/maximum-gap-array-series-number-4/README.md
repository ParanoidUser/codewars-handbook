# [Maximum Gap (Array Series #4)](https://www.codewars.com/kata/maximum-gap-array-series-number-4 "https://www.codewars.com/kata/5a7893ef0025e9eb50000013")

**_Given_** an *array/list [] of integers* , **_Find_** **_The maximum difference_** *between the successive elements in its sorted form*. 

## Notes 

* **_Array/list_** size is *at least 3*  .
* **_Array/list's numbers_**  Will be **mixture of positives and negatives also zeros_**  
* **_Repetition_** of numbers in *the array/list could occur*.
* **_The Maximum Gap_** is *computed Regardless the sign*.

## Input >> Output Examples 

```
maxGap ({13,10,5,2,9}) ==> return (4)
```

### **_Explanation_**: 

* **_The Maximum Gap_** *after sorting the array is* `4` , *The difference between*   ``` 9 - 5 = 4 ``` .

```
maxGap ({-3,-27,-4,-2}) ==> return (23)
```

## **_Explanation_**: 

* **_The Maximum Gap_** *after sorting the array is* `23` , *The difference between*   ` |-4- (-27) | = 23` .
*  **_Note_** : *Regardless the sign of negativity* .

```
maxGap ({-7,-42,-809,-14,-12}) ==> return (767)  
```

### **_Explanation_**: 

* **_The Maximum Gap_** *after sorting the array is* `767` , *The difference between*   ` | -809- (-42) | = 767` .
*  **_Note_** : *Regardless the sign of negativity* .

```
maxGap ({-54,37,0,64,640,0,-15}) //return (576)
```

### **_Explanation_**: 

* **_The Maximum Gap_** *after sorting the array is* `576` , *The difference between*   ` | 64 - 640 | = 576` .
*  **_Note_** : *Regardless the sign of negativity* .