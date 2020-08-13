# [The Poet And The Pendulum](https://www.codewars.com/kata/the-poet-and-the-pendulum "https://www.codewars.com/kata/5bd776533a7e2720c40000e5")

*the rhythm of beautiful musical notes is drawing a Pendulum* 

**_Beautiful musical notes_** are the **_Numbers_**  ![!alt](https://i.imgur.com/mdX8dJP.png) ![!alt](https://i.imgur.com/mdX8dJP.png)

## Task

**_Given_** an *array/list [] of n integers* , **_Arrange_** *them in a way similar to the to-and-fro movement of a Pendulum* 

* **_The Smallest element_** of the list of integers , must come *in center position of array/list*.
* **_The Higher than smallest_** , *goes to the right* . 
* **_The Next higher_** number goes *to the left of minimum number* and So on , in a to-and-fro manner similar to that of a Pendulum.

![!alt](https://i.imgur.com/xWoPbdq.png)

## Notes

* **_Array/list_** size is *at least **_3_*** .
* In **_Even array size_** , *The minimum element should be moved to (n-1)/2 index* (considering that indexes start from 0)
* **_Repetition_** of numbers in *the array/list could occur* , So **_(duplications are included when Arranging)_**.

## Input >> Output Examples:

```
pendulum ([6, 6, 8 ,5 ,10]) ==> [10, 6, 5, 6, 8]
```

### **_Explanation_**:

* **_Since_** , `5` is the **_The Smallest element_** of the list of integers , came *in The center position of array/list*
* **_The Higher than smallest_** is `6`  *goes to the right* of `5` .  
* **_The Next higher_** number goes *to the left of minimum number* and So on .
* Remember , **_Duplications are included when Arranging_** , Don't Delete Them .

```
pendulum ([-9, -2, -10, -6]) ==> [-6, -10, -9, -2]
```

### **_Explanation_**:

* **_Since_** , `-10` is the **_The Smallest element_** of the list of integers , came *in The center position of array/list*
* **_The Higher than smallest_** is `-9`  *goes to the right* of it .  
* **_The Next higher_** number goes *to the left of* `-10` , and So on .
* Remember , In **_Even array size_** , *The minimum element moved to (n-1)/2 index* (considering that indexes start from 0) .

```
pendulum ([11, -16, -18, 13, -11, -12, 3, 18 ]) ==> [13, 3, -12, -18, -16, -11, 11, 18]
```

### **_Explanation_**:

* **_Since_** , `-18` is the **_The Smallest element_** of the list of integers , came *in The center position of array/list*
* **_The Higher than smallest_** is `-16`  *goes to the right* of it .  
* **_The Next higher_** number goes *to the left of*  `-18` , and So on .
* Remember , In **_Even array size_** , *The minimum element moved to (n-1)/2 index* (considering that indexes start from 0) .

Tune Your Code, There are 200 Assertions, 60.000 element For Each .