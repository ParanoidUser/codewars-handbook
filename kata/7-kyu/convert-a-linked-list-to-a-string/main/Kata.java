interface Kata {
  static String stringify(Node list) {
    return list == null ? "null" : list.getData() + " -> " + stringify(list.getNext());
  }
}
