interface Solution {
  static String solve(String eq) {
    var reverse = new StringBuilder();
    for (var chunk : eq.split("(?=\\b)")) {
      reverse.insert(0, chunk);
    }
    return reverse.toString();
  }
}