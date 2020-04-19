class Dinglemouse {
  static boolean same(String a, String b) {
    return a.replace(b, "").isEmpty();
  }
}