interface Zero {
  static boolean isZero(String e) {
    return e.matches(".*\\*?0(\\*|$).*");
  }
}