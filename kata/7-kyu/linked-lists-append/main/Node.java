class Node {
  static Node append(Node listA, Node listB) {
    if (listA == null && listB == null) {
      return null;
    } else if (listA != null && listB != null) {
      Node last = listA;
      while (last.next != null) {
        last = last.next;
      }
      last.next = listB;
      return listA;
    }
    return listA != null ? listA : listB;
  }

  final int data;
  Node next;

  Node(int data) {
    this(data, null);
  }

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}