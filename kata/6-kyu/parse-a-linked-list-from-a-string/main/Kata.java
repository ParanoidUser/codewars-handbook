interface Kata {
  static Node parseLinkedList(String str) {
    Node head = null;
    String[] values = str.split(" -> ");
    for (int i = values.length - 2; i >= 0; i--) {
      head = new Node(Integer.parseInt(values[i]), head);
    }
    return head;
  }
}