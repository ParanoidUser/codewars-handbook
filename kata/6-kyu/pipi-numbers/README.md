# [pipi Numbers!](https://www.codewars.com/kata/pipi-numbers "https://www.codewars.com/kata/5af27e3ed2ee278c2c0000e2")

Hello. Today our job is to find the `N`th Pipi number.

Let us define P<sub>n</sub> such that the following expression:

``$\sqrt{P_{0}+\sqrt{P_{1}+\sqrt{P{_2}+\sqrt{...\sqrt{P_{n-1}+\sqrt{P_n}}}}}}$``

is equal to `n`, if P<sub>0</sub> = 0.

## Examples:

```
pipi(0) == 0
```
because 

``$0 = 0$``

___

```
pipi(1) == 1
```
because 

``$0+\sqrt{1} = 1$``

___

```
pipi(2) == 9 
```
because 

``$0+\sqrt{1+\sqrt{9}} = 2$``

___

```
pipi(3) == 3025
```
because 

``$0+\sqrt{1+\sqrt{9+\sqrt{3025}}} = 3$``

___

## Number N range:
```
From `0` to `22`.
```