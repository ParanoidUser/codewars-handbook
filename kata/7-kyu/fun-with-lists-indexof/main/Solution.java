interface Solution {
  static int indexOf(Node head, Object value) {
    for (var i = 0; head != null; head = head.next, i++) {
      if (head.data.equals(value)) return i;
    }
    return -1;
  }
}