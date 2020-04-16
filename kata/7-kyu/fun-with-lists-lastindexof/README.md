# [Fun with lists: lastIndexOf](https://www.codewars.com/kata/fun-with-lists-lastindexof "https://www.codewars.com/kata/581c867a33b9fe732e000076")

Implement the method **lastIndexOf** (`last_index_of` in PHP), which accepts a linked list (head) and a value, and returns the index (zero based) of the *last* occurrence of that value if exists, or -1 otherwise.

For example:
Given the list: `1 -> 2 -> 3 -> 3`, and the value 3, **lastIndexOf** / `last_index_of` should return 3.

The linked list is defined as follows:

```
class Node {
  public Object data;
  public Node next;

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