interface Kata {
  static Node reverse(Node node) {
    Node prev = null;
    while (node != null) {
      var next = node.next;
      node.next = prev;
      prev = node;
      node = next;
    }
    return prev;
  }
}