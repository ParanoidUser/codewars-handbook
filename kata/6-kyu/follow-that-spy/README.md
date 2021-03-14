# [Follow that Spy](https://www.codewars.com/kata/follow-that-spy "https://www.codewars.com/kata/5899a4b1a6648906fe000113")

We are tracking down our rogue agent **Matthew Knight** also known as **Roy Miller**. He travels from places to places to avoid being tracked. Each of his travels are based on a list of itineraries in an unusual or incorrect order. The task is to determine the routes he will take in his every journey.

## Task 

You are given an array of `routes` of his itineraries. List down the **only places** where he will go in correct order based on his itineraries.

## Example

Given the following routes:

```
[ [USA, BRA], [JPN, PHL], [BRA, UAE], [UAE, JPN] ]
```

The result will be:

```
"USA, BRA, UAE, JPN, PHL"
```


**Note:** 

* It is safe to assume that there will be **no repeating place with a different route**.
* There are **no empty routes**.
* There will be **at least one (1)** route (from one waypoint to another).