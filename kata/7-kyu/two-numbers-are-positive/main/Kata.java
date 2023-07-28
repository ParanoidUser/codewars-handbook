interface Kata {
  static boolean twoArePositive(int a, int b, int c) {
    return a > 0 ? b > 0 != c > 0 : b > 0 && c > 0;
  }
}