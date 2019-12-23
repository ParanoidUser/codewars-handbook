class Node {
  int data;
  Node next;

  Node(int data) {
    this(null, data);
  }

  Node(Node child, int data) {
    this.next = child;
    this.data = data;
  }

  static Node push(Node head, int data) {
    return new Node(head, data);
  }

  static Node buildOneTwoThree() {
    return new Node(new Node(new Node(3), 2), 1);
  }
}
