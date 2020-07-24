# [Separate The Wheat From The Chaff](https://www.codewars.com/kata/separate-the-wheat-from-the-chaff "https://www.codewars.com/kata/5bdcd20478d24e664d00002c")

With **_Cereal crops_** like wheat or rice, before we can eat the grain kernel, we need to remove that inedible hull, or *to separate the wheat from the chaff*.

## Task

**_Given_** a *sequence of n integers* , **_separate_** *the negative numbers (chaff) from positive ones (wheat).*  ![!alt](https://i.imgur.com/mdX8dJP.png)

## Notes

* **_Sequence size_** is _at least_ **_3_**
* **_Return_** *a new sequence*, such that  **_negative numbers (chaff) come first, then positive ones (wheat)_**.
* In Java , *you're not allowed to modify the input Array/list/Vector*
* **_Have no fear_** , *it is guaranteed that there will be no zeroes* . ![!alt](https://i.imgur.com/mdX8dJP.png)  
* **_Repetition_** of numbers in *the input sequence could occur* , so **_duplications are included when separating_**.
* If a misplaced *positive* number is found in the front part of the sequence, replace it with the last misplaced negative number (the one found near the end of the input). The second misplaced positive number should be swapped with the second last misplaced negative number. *Negative numbers found at the head (beginning) of the sequence* , **_should be kept in place_** .

## Input >> Output Examples:

```
wheatFromChaff ({7, -8, 1 ,-2}) ==> return ({-2, -8, 1, 7}) 
```

## **_Explanation_**:

* **_Since_** `7 ` is a  **_positive number_** , it should not be located at the beginnig so it needs to be swapped with the **last negative number** `-2`.

```
wheatFromChaff ({-31, -5, 11 , -42, -22, -46, -4, -28 }) ==> return ({-31, -5,- 28, -42, -22, -46 , -4, 11})
```

## **_Explanation_**:

* **_Since_**, `{-31, -5} ` are  **_negative numbers_** *found at the head (beginning) of the sequence* , *so we keep them in place* .
* Since `11` is a positive number, it's replaced by  the last negative which is `-28` , and so on till separation is complete. 


```
wheatFromChaff ({-25, -48, -29, -25, 1, 49, -32, -19, -46, 1}) ==> return ({-25, -48, -29, -25, -46, -19, -32, 49, 1, 1})
```

## **_Explanation_**:

* **_Since_** `{-25, -48, -29, -25} ` are  **_negative numbers_** *found at the head (beginning) of the input* , *so we keep them in place* .

* Since `1` is a positive number, it's replaced by  the last negative which is `-46` , and so on till separation is complete. 

* Remember, *duplications are included when separating* , that's why the number `1` appeared twice at the end of the output. 

Tune Your Code , There are 250 Assertions , 100.000 element For Each.
Only O(N) Complexity Solutions Will pass. 