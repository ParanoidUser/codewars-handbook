class Node {
  Object data;
  Node next;

  Node(Object data) {
    this(data, null);
  }

  Node(Object data, Node next) {
    this.data = data;
    this.next = next;
  }
}
