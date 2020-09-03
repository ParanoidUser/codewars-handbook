# [Nth Smallest Element (Array Series #4)](https://www.codewars.com/kata/nth-smallest-element-array-series-number-4 "https://www.codewars.com/kata/5a512f6a80eba857280000fc")

**_Given_** an *array/list [] of integers* , **_Find_**  *the Nth smallest element in this array of integers*

## Notes 

* **_Array/list_** size is *at least 3* .
* **_Array/list's numbers_** *could be a **_mixture_** of positives , negatives and zeros* .
* **_Repetition_** *in array/list's numbers could occur* , so **_don't Remove Duplications_** .

## Input >> Output Examples

```
nthSmallest({3,1,2} ,2) ==> return (2) 
```

### **_Explanation_**:

Since the passed number is **_2_** , Then * **_the second smallest_** element in this array/list is **_2_***  

```
nthSmallest({15,20,7,10,4,3} ,3) ==> return (7) 
```

### **_Explanation_**:

Since the passed number is **_3_** , Then * **_the third smallest_** element in this array/list is **_7_*** 

```
nthSmallest({2,169,13,-5,0,-1} ,4) ==> return (2) 
```

### **_Explanation_**:

Since the passed number is **_4_** , Then * **_the fourth smallest_** element in this array/list is **_2_*** 

```
nthSmallest({177,225,243,-169,-12,-5,2,92} ,5) ==> return (92) 
```

### **_Explanation_**:

Since the passed number is **_5_** , Then * **_the fifth smallest_** element in this array/list is **_92_*** 