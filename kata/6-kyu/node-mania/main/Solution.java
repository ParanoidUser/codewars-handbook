interface Solution {
  static Integer searchKFromEnd(Node head, int k) {
    Node pointer = head;
    while (pointer != null) {
      pointer = pointer.next;
      if (k-- < 1) {
        head = head.next;
      }
    }
    return k < 1 ? head.data : null;
  }
}