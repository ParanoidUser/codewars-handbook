interface StringUtils {
  static boolean isLetter(String s) {
    return s.matches("(?i)[a-z]");
  }
}
