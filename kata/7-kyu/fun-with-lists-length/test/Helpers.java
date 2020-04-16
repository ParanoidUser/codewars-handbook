class Helpers {
  static Node listFromArray(Object... array) {
    if (array.length == 0) return null;
    Node head = new Node(array[0]);
    Node prev = head;
    for (int i = 1; i < array.length; i++) {
      Node curr = new Node(array[i]);
      prev.next = curr;
      prev = curr;
    }
    return head;
  }
}
