interface Solution {
  static int shiftLeft(String a, String b) {
    return a.equals(b) ? 0 : (a.length() > b.length() ? shiftLeft(a.substring(1), b) : shiftLeft(a, b.substring(1))) + 1;
  }
}
