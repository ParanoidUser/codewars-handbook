# [Maximum Triplet Sum (Array Series #7)](https://www.codewars.com/kata/maximum-triplet-sum-array-series-number-7 "https://www.codewars.com/kata/5aa1bcda373c2eb596000112")

**_Given_** an *array/list [] of n integers* , *find maximum triplet sum in the array* **_Without duplications_**.

## Notes :

* **_Array/list_** size is *at least 3* .
* **_Array/list_** numbers could be a *mixture of positives , negatives and zeros* .
* **_Repetition_** of numbers in *the array/list could occur* , So **_(duplications are not included when summing)_**.

## Input >> Output Examples 

```
1- maxTriSum ({3,2,6,8,2,3}) ==> return (17)
```

### **_Explanation_**:

* As the **_triplet_** that *maximize the sum* **_{6,8,3}_** in order , **_their sum is (17)_** 
* *Note* : **_duplications_** *are not included when summing* , **(i.e) the numbers added only once** .

```
2- maxTriSum ({2,1,8,0,6,4,8,6,2,4}) ==> return (18)
```

### **_Explanation_**:

* As the **_triplet_** that *maximize the sum* **_{8, 6, 4}_** in order , **_their sum is (18)_** , 
* *Note* : **_duplications_** *are not included when summing* , **(i.e) the numbers added only once** .

```
3- maxTriSum ({-7,12,-7,29,-5,0,-7,0,0,29}) ==> return (41)
```

### **_Explanation_**:

* As the **_triplet_** that *maximize the sum* **_{12 , 29 , 0}_** in order , **_their sum is (41)_** , 
* *Note* : **_duplications_** *are not included when summing* , **(i.e) the numbers added only once** .