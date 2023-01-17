class Node {
  static Node buildOneTwoThree() {
    return push(push(new Node(3), 2), 1);
  }

  static Node push(Node head, int data) {
    return new Node(head, data);
  }

  final int data;
  final Node next;

  Node(int data) {
    this(null, data);
  }

  Node(Node child, int data) {
    this.next = child;
    this.data = data;
  }
}