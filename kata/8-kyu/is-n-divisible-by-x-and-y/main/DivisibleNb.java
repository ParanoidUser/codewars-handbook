interface DivisibleNb {
  static boolean isDivisible(long n, long x, long y) {
    return n % x == 0 && n % y == 0;
  }
}
