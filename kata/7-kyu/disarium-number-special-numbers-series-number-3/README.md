# [Disarium Number (Special Numbers Series #3)](https://www.codewars.com/kata/disarium-number-special-numbers-series-number-3 "https://www.codewars.com/kata/5a53a17bfd56cb9c14000003")

**_Disarium number_** is the number that *The sum of its digits powered with their respective positions is equal to the number itself*.

## Task

**_Given_** a number, **_Find if it is Disarium or not_** . 

## Notes 

* **_Number_** *passed is always*  **_Positive_** .
* **_Return_** *the result as* **_String_**

## Input >> Output Examples

```
disariumNumber(89) ==> return "Disarium !!"
```

### **_Explanation_**:

* Since , **_8<sup>1</sup> + 9<sup>2</sup> = 89_** , thus *output* is `"Disarium !!"`

```
disariumNumber(564) ==> return "Not !!"
```

### **_Explanation_**:

Since , **_5<sup>1</sup> + 6<sup>2</sup> + 4<sup>3</sup> = 105 != 546_** ,  thus *output* is `"Not !!"`