interface Groups {
  static boolean groupCheck(String s) {
    for (int i = s.length() / 2; i > 0; i--)
      s = s.replaceAll("\\(\\)|\\[]|\\{}", "");
    return s.isEmpty();
  }
}
