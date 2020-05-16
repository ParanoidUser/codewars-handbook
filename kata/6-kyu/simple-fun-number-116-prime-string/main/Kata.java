interface Kata {
  static boolean primeString(String s) {
    return (s + s).indexOf(s, 1) == s.length();
  }
}
