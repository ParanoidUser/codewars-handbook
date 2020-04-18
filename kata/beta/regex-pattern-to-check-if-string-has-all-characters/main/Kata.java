class Kata {
  static String regexContainsAll(String str) {
    return str.replaceAll(".", "(?=.*$0)");
  }
}