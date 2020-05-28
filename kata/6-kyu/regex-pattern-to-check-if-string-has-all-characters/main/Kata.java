interface Kata {
  static String regexContainsAll(String str) {
    return str.replaceAll("(.)", "(?=.*$1)");
  }
}