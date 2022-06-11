interface Suite2 {
  static String game(long n) {
    return "[" + (n % 2 > 0 ? n * n + ", 2]" : n * n / 2 + "]");
  }
}
