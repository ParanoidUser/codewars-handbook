interface Solution {
  static String replace(final String s) {
    return s.replaceAll("(?i)[aeiou]", "!");
  }
}
