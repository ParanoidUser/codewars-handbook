# [Fun with lists: anyMatch + allMatch](https://www.codewars.com/kata/fun-with-lists-anymatch-plus-allmatch "https://www.codewars.com/kata/581e50555f59405743001813")

Implement the methods **anyMatch** (`any_match` in PHP) & **allMatch** (`all_match` in PHP), which accepts a linked list (head) and a predicate function, and returns true if any / all of the elements apply to the given predicate.

For example:

Given the list: `1 -> 2 -> 3`, and the predicate `x => x > 1`, **anyMatch** / `any_match` should return true (both 2 & 3 are valid for this predicate), and **allMatch** / `all_match` should return false (1 is not valid for this predicate)

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