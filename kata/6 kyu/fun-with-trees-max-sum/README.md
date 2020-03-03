# [Fun with trees: max sum](https://www.codewars.com/kata/fun-with-trees-max-sum "https://www.codewars.com/kata/57e5279b7cf1aea5cf000359")

You are given a binary tree. Implement the method **maxSum** which returns the maximal sum of a route from root to leaf.
For example, given the following tree:
```
    17
   /  \
  3   -10
 /    /  \
2    16   1
         /
        13
```

The method should return 23, since [17,-10,16] is the route from root to leaf with the maximal sum.


The class TreeNode is available for you:

```
class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;
    ...
}
```