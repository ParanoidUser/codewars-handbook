# [Form The Minimum](https://www.codewars.com/kata/form-the-minimum "https://www.codewars.com/kata/5ac6932b2f317b96980000ca")

**_Given_** a **_list of digits_**, *return the **_smallest number_** that could be formed from these digits, using the digits only once (ignore duplicates).* 

## Notes:

* Only **_positive integers_** *will be passed to the function (> 0 ), no negatives or zeros.*

## Input >> Output Examples 

```
minValue ({1, 3, 1})  ==> return (13)
```

### Explanation:

**_(13)_** *is the minimum number could be formed from* **_{1, 3, 1}_** , *Without duplications*  

```
minValue({5, 7, 5, 9, 7})  ==> return (579)
```

### Explanation:

**_(579)_** *is the minimum number could be formed from* **_{5, 7, 5, 9, 7}_** , *Without duplications* 


```
minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)
```

### Explanation:

**_(134679)_** *is the minimum number could be formed from* **_{1, 9, 3, 1, 7, 4, 6, 6, 7}_** , *Without duplications* 