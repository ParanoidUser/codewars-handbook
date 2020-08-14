# [Array Leaders (Array Series #3)](https://www.codewars.com/kata/array-leaders-array-series-number-3 "https://www.codewars.com/kata/5a651865fd56cb55760000e0")

An **_element is leader_** *if it is greater than The Sum all the elements to its right side*.

## Task

**_Given_** an *array/list [] of integers* , **_Find_** *all the **_LEADERS_** in the array*.

## Notes 

* **_Array/list_** size is *at least 3* .
* **_Array/list's numbers_**  Will be **_mixture of positives , negatives and  zeros_** 
* **_Repetition_** of numbers in *the array/list could occur*.
* **_Returned Array/list_** *should store the leading numbers **_in the same order_** in the original array/list* .

## Input >> Output Examples 

```
arrayLeaders ({1, 2, 3, 4, 0}) ==> return {4}
```

## **_Explanation_**: 

* `4`  *is greater than the sum all the elements to its right side*

* **_Note_** : **_The last element_** `0`  *is equal to right sum of its elements (abstract zero)*.

```
arrayLeaders ({16, 17, 4, 3, 5, 2}) ==> return {17, 5, 2}
```

## **_Explanation_**: 

* `17`  *is greater than the sum all the elements to its right side*

* `5`  *is greater than the sum all the elements to its right side*

* **_Note_** : **_The last element_**  `2`  *is  greater than the sum of its right elements (abstract zero)*. 

```
arrayLeaders ({5, 2, -1}) ==> return {5, 2}
```

## **_Explanation_**: 

* `5`  *is greater than the sum all the elements to its right side*

* `2`  *is greater than the sum all the elements to its right side*

* **_Note_** : **_The last element_**  `-1`  *is less than the sum of its right elements (abstract zero)*.


```
arrayLeaders ({0, -1, -29, 3, 2}) ==> return {0, -1, 3, 2}
```

## **_Explanation_**: 

* `0`  *is greater than the sum all the elements to its right side*

* `-1`  *is greater than the sum all the elements to its right side*

* `3`  *is greater than the sum all the elements to its right side*

* **_Note_** : **_The last element_**  `2`  *is  greater than the sum of its right elements (abstract zero)*. 