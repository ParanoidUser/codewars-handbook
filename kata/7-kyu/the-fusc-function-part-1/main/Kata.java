interface Kata {
  static int fusc(int n) {
    return n < 2 ? n : fusc(n / 2) + (n % 2 == 0 ? 0 : fusc(n / 2 + 1));
  }
}
