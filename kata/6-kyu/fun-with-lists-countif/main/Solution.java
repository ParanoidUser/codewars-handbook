import java.util.function.Predicate;

interface Solution {
  static <T> int countIf(Node<T> head, Predicate<T> p) {
    return head == null ? 0 : countIf(head.next, p) + (p.test(head.data) ? 1 : 0);
  }
}