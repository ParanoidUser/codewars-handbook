interface ReverseLonger {
  static String shorterReverseLonger(String a, String b) {
    return a.length() < b.length() ? a + new StringBuilder(b).reverse() + a : b + new StringBuilder(a).reverse() + b;
  }
}
