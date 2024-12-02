interface Kata {
  static boolean isUpperCase(String s) {
    return s.matches("[^a-z]*");
  }
}