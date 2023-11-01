# [Mode Count](https://www.codewars.com/kata/mode-count "https://www.codewars.com/kata/5d9dce868fd3c90016cfbb35")

In statistic is known the term mode. The mode of a set of data values is the value that appears most often. For example suppose the set of data values are {1,2,2,3}. There are three number inside the data set: 1, 2, and 3. Number 1 appears once, 2 appears twice, and 3 appears once. That mean number 2 appears most often so the mode is 2.

Sometimes we can find that the most often more than one number here the example
```
Data set    = {2,2,2,3,3,3,4,5,6}
Mode result = {2,3}
```
In this Kata, your task is to make a function called ```int modeCount(int[] data)``` that the parameter is an array of integer and the result is integer. The parameter is a set of data values that you will find the mode. The output is how many kind of mode. Here the example:
```
Data set    = {2,2,2,3,3,3,4,5,6}
Mode result = {2,3}
Mode count  = 2

Data set    = {1,2,2,3}
Mode result = {2}
Mode count  = 1

Data set    = {2,2,2,3,3,3,4,5,6,6,6}
Mode result = {2,3,6}
Mode count  = 3
```