interface Kata {
  static String stringy(int size) {
    return "10".repeat(size / 2) + (size % 2 != 0 ? '1' : "");
  }
}
