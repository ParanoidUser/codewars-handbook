class Pattern {
  static String pattern(int n) {
    String row = "", pattern = "";
    while (n > 0) {
      pattern = (row = n-- + row) + (pattern.isEmpty() ? "" : "\n") + pattern;
    }
    return pattern;
  }
}
