class Node {
  final Object data;
  final Node next;

  Node(Object data) {
    this(data, null);
  }

  Node(Object data, Node next) {
    this.data = data;
    this.next = next;
  }
}