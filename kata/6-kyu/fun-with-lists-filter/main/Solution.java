import java.util.function.Predicate;

interface Solution {
  static <T> Node<T> filter(Node<T> head, Predicate<T> p) {
    return head != null ? p.test(head.data) ? new Node<>(head.data, filter(head.next, p)) : filter(head.next, p) : null;
  }
}