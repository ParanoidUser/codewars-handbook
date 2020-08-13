# [Minimum Steps (Array Series #6)](https://www.codewars.com/kata/minimum-steps-array-series-number-6 "https://www.codewars.com/kata/5a91a7c5fd8c061367000002")

**_Given_** *an array of N integers, you have to find* **_how many times_** *you have to* **_add up the smallest numbers_** *in the array until* **_their Sum_**  *becomes greater or equal to* **_K_**.
 
## Notes: 

* **_List size_**  is *at least 3*.
* **_All numbers_**  *will be*  **_positive_**.
* **_Numbers_**  could  *occur more than once* ,   **_(Duplications may exist)_**.
* Threshold  **_K_**  will *always be reachable*.

## Input >> Output Examples

```
minimumSteps({1, 10, 12, 9, 2, 3}, 6)  ==>  return (2)
```

### **_Explanation_**:

* We  *add two smallest elements*  **_(1 + 2)_**,  *their sum is 3* .
* **_Then_**  we  **_add the next smallest number to it (3 + 3)_** , so  *the sum becomes 6* .
* **_Now_**  the result is greater or equal to **_6_** ,  *Hence the output is (2) i.e (2) operations are required to do this* .

```
minimumSteps({8 , 9, 4, 2}, 23)  ==> return (3)
```

### **_Explanation_**:

* We  *add two smallest elements*  **_(4 + 2)_**,  *their sum is 6* .
* **_Then_**  we  **_add the next smallest number to it (6 + 8)_** , so *the sum becomes 14* .
* **_Now_**  we  **_add the next smallest number (14 + 9)_** , so *the sum becomes 23*  .
* **_Now_**  the result is greater or equal to **_23_** ,  *Hence the output is (3) i.e (3) operations are required to do this* .

```
minimumSteps({19,98,69,28,75,45,17,98,67}, 464)  ==>  return (8)
```

### **_Explanation_**:

* We  *add two smallest elements*  **_(19 + 17)_**,  *their sum is 36* .
* **_Then_**  we  **_add the next smallest number to it (36 + 28)_** , so *the sum becomes 64* .
* We need to **_keep doing this_** *until **_the sum_** becomes greater or equal to **_K_** (464 in this case)*, which will require **_8_** Steps .

Expected Time Complexity `O(n Log n)`
