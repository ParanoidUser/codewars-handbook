# [Find Max Tree Node](https://www.codewars.com/kata/find-max-tree-node "https://www.codewars.com/kata/5a04450c8ba914083700000a")

You are given a binary tree. Implement the method findMax which returns the maximal node value in the tree. 

For example, maximum in the following Tree is 11.
```
              7
            /   \ 
           /     \
          5       2
           \       \
           6        11          
           /\      /
          1  9   4
```


Note:
- Tree node values range is Integer MIN VALUE - Integer MAX VALUE constants.
- Tree can unbalanced and unsorted.
- Root node is always not null.

You are given a tree node class as follows:
```
class TreeNode {
  TreeNode  left;
  TreeNode  right;
  int value;
}
```