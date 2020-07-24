interface Pentanacci {
  static long countOddPentaFib(long n) {
    return --n / 6 + --n / 6 + 1;
  }
}
