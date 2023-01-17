class Node<T> {
  final T data;
  final Node<T> next;

  Node(T data) {
    this(data, null);
  }

  Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }
}