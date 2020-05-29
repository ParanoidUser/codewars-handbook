import java.util.function.BiFunction;

interface Solution {
  static <T> T reduce(Node<T> head, BiFunction<T, T, T> f, T init) {
    return head != null ? reduce(head.next, f, f.apply(init, head.data)) : init;
  }
}