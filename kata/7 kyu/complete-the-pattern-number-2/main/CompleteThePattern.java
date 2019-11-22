class CompleteThePattern {
  static String pattern(int n) {
    String row = "", pattern = "";
    while (n > 0) {
      pattern = (row += n--) + (pattern.isEmpty() ? "" : "\n") + pattern;
    }
    return pattern;
  }
}
