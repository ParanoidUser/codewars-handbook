interface IntSqRoot {
  static long intRac(long n, long guess) {
    return Math.abs(guess - (guess + n / guess) / 2) < 1 ? 1 : 1 + intRac(n, (guess + n / guess) / 2);
  }
}
