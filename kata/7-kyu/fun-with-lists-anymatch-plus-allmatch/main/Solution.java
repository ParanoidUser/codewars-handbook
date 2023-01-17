import java.util.function.Predicate;

interface Solution {
  static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {
    while (head != null) {
      if (p.test(head.data)) {
        return true;
      }
      head = head.next;
    }
    return false;
  }

  static <T> boolean allMatch(Node<T> head, Predicate<T> p) {
    return !anyMatch(head, p.negate());
  }
}