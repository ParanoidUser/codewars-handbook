# [Transform To Prime](https://www.codewars.com/kata/transform-to-prime "https://www.codewars.com/kata/5a946d9fba1bb5135100007c")

**_Given_** *a List[] of n integers*, **_find minimum number_** to be **inserted** in a *list*, so that **_sum of all elements of list_** should *equal the closest prime number*.

## Notes

* **_List size_** is *at least 2*.

* **_List's numbers_** will only **_positives_** (n > 0).

* **_Repetition_** of numbers in the list **_could occur_**.

* **_The newer list's sum_** should *equal the closest prime number*. 

## Input >> Output Examples

```
1- minimumNumber ({3,1,2}) ==> return (1)
```
## **_Explanation_**:

* **_Since_**, **the sum** of the list's elements equal to **_(6)_**, *the minimum number to be inserted to transform the sum to prime number* is **_(1)_**, *which will make **_the sum of the List_** equal the closest prime number **_(7)_***.


```
2-  minimumNumber ({2,12,8,4,6}) ==> return (5)
```
## **_Explanation_**: 

* **_Since_**, **the sum** of the list's elements equal to **_(32)_**, *the minimum number to be inserted to transform the sum to prime number* is **_(5)_**, *which will make **_the sum of the List_** equal the closest prime number **_(37)_***.


```
3- minimumNumber ({50,39,49,6,17,28}) ==> return (2)
```
## **_Explanation_**: 

* **_Since_**, **the sum** of the list's elements equal to **_(189)_**, *the minimum number to be inserted to transform the sum to prime number* is **_(2)_**, *which will make **_the sum of the List_** equal the closest prime number **_(191)_***.