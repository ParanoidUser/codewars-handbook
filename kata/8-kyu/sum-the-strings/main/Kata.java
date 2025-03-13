interface Kata {
  static String sumStr(String a, String b) {
    return (a.isEmpty() ? 0 : Integer.parseInt(a)) + (b.isEmpty() ? 0 : Integer.parseInt(b)) + "";
  }
}