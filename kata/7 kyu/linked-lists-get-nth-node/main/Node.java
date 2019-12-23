class Node {
  int data;
  Node next;

  static int getNth(Node n, int index) {
    return index == 0 ? n.data : getNth(n.next, --index);
  }
}
