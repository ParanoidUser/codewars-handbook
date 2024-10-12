# [Find the smallest power higher than a given a value](https://www.codewars.com/kata/find-the-smallest-power-higher-than-a-given-a-value "https://www.codewars.com/kata/56ba65c6a15703ac7e002075")

We have the number ```12385``` . We want to know the value of the closest cube but higher than 12385. The answer will be ```13824``` .

Now, another case. We have the number ```1245678``` . We want to know the 5th power, closest and higher than that number. The value will be
```1419857```.

We need a function that receives two arguments, a value ```val``` , and the exponent of the power, ``` pow_``` , and outputs the value that
we want to find.

Let's see some cases:

```
(12385, 3) ==> 13824
(1245678, 5) ==> 1419857
```

The value, ```val``` will be always a positive integer.

The power, ```pow_``` , always higher than ```1``` .