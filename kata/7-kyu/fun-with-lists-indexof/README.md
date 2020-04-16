# [Fun with lists: indexOf](https://www.codewars.com/kata/fun-with-lists-indexof "https://www.codewars.com/kata/581c6b075cfa83852700021f")

Implement the method **indexOf** (`index_of` in PHP), which accepts a linked list (head) and a value, and returns the index (zero based) of the *first* occurrence of that value if exists, or -1 otherwise.

For example:
Given the list: `1 -> 2 -> 3 -> 3`, and the value 3, **indexOf** / `index_of` should return 2.

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