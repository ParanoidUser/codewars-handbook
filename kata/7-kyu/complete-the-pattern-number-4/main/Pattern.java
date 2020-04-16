class Pattern {
  static String pattern(int n) {
    StringBuilder row = new StringBuilder(), pattern = new StringBuilder();
    while (n > 0) {
      pattern.insert(0, row.insert(0, n--)).insert(0, n > 0 ? "\n" : "");
    }
    return pattern.toString();
  }
}
