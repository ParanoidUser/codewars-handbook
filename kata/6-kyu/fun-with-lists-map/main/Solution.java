import java.util.function.Function;

class Solution {
  static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {
    return head == null ? null : new Node<>(f.apply(head.data), map(head.next, f));
  }
}