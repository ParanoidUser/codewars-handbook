interface Kata {
  static boolean nameInStr(String str, String name) {
    return str.matches(name.replace("", ".*"));
  }
}