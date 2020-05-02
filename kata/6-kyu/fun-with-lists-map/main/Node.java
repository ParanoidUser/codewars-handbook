import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
class Node<T> {
  final T data;
  Node<T> next;
}
