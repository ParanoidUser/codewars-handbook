interface Suite2 {
  static String game(long n) {
    return "[" + ((n *= n) % 2 > 0 ? n + ", 2]" : n / 2 + "]");
  }
}
