interface Solution {
  static int lastIndexOf(Node head, Object value) {
    int index = -1;
    for (var i = 0; head != null; head = head.next, i++) {
      if (head.data.equals(value)) index = i;
    }
    return index;
  }
}