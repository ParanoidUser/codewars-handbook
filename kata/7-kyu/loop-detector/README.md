# [Loop Detector](https://www.codewars.com/kata/loop-detector "https://www.codewars.com/kata/68851563123e161332d2a84b")

In this kata, you'll simulate traversing a one-way pointer chain, similar to a singly linked list. Each element in the input list represents
the index of the next element to move to.

Your task is to determine whether this chain eventually enters a loop, or whether it terminates by stepping out of bounds.

## Function Signature

* ```arr``` is a list or array of non-negative integers.

* Return ```True``` (or your language's equivalent) if the traversal enters a loop.

* Return ```False``` (or your language's equivalent) if the traversal terminates.

## How Traversal Works

* Begin at index ```0```.

* Read the value at the current index to get the next index.

* Continue stepping through the array.

* If you encounter an index you've already visited, you've found a loop — return ```True``` (or your language's equivalent).

* If a step takes you to an index outside the array, the traversal ends — return ```False``` (or your language's equivalent).

## Examples

```
Input: 1, 2, 3, 4, 2 ➞ True
Path: 0 -> 1 -> 2 -> 3 -> 4 -> 2 -> ... (loop detected)

Input: 1, 2, 3, 4, 5 ➞ False
Path: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> (out of bounds)

Input: 0 ➞ True
Path: 0 -> 0 -> 0 -> ... (self-loop)

Input: 3, 2, 1, 6 ➞ False
Path: 0 -> 3 -> 6 -> (out of bounds)

Input: 1, 0 ➞ True
Path: 0 -> 1 -> 0 -> 1 -> ... (cycle of two)
```

## Notes

* The input may be empty. In that case, return ```False``` (or your language's equivalent).

* All elements are guaranteed to be non-negative integers.

* You must detect any kind of loop, whether it be a:

LICENSE build.gradle.kts docs gradle gradle.properties gradlew gradlew.bat kata settings.gradle.kts Self-loop (e.g., ```[0]```)

LICENSE build.gradle.kts docs gradle gradle.properties gradlew gradlew.bat kata settings.gradle.kts Two-node loop (e.g., ```[1, 0]```)

LICENSE build.gradle.kts docs gradle gradle.properties gradlew gradlew.bat kata settings.gradle.kts Larger cycle (e.g., ```[1, 2, 0]```)

* An index is considered out of bounds if it is greater than or equal to ```len(arr)```.