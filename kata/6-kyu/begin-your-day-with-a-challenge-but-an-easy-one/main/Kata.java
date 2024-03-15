interface Kata {
  static String[] oneTwoThree(int n) {
    return new String[]{"9".repeat(n / 9) + (n > 0 && n % 9 < 1 ? "" : n % 9), n > 0 ? "1".repeat(n) : "0"};
  }
}