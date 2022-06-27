interface CompleteThePattern {
  static String pattern(int n) {
    var row = new StringBuilder();
    var pattern = new StringBuilder();
    while (n > 0) {
      pattern.insert(0, row.append(n--)).insert(0, n > 0 ? "\n" : "");
    }
    return pattern.toString();
  }
}
