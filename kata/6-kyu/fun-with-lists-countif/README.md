# [Fun with lists: countIf](https://www.codewars.com/kata/fun-with-lists-countif "https://www.codewars.com/kata/5819081d056d4bdd410004f8")

Implement the method **countIf** (`count_if` in PHP), which accepts a linked list (head) and a predicate function, and returns the number of elements which apply to the given predicate.

For example:
Given the list: `1 -> 2 -> 3`, and the predicate `x => x >= 2`, **countIf** / `count_if` should return 2, since `x >= 2` applies to both 2 and 3.

The linked list is defined as follows:

```
class Node<T> {
  public T data;
  public Node<T> next;
  
  Node(T data, Node next) {
    this.data = data;
    this.next = next;
  }
  
  Node(T data) {
    this(data, null);
  }
}
```

Note: the list may be null and can hold any type of value.