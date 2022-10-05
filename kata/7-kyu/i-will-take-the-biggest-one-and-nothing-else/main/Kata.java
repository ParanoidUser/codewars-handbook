interface Kata {
  static long maxIntChain(long n) {
    return n > 4 ? (n - 1) / 2 * (n / 2 + 1) : -1;
  }
}