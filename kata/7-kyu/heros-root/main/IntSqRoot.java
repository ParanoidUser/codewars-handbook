interface IntSqRoot {
  static long IntRac(long n, long guess) {
    return Math.abs(guess - (guess + n / guess) / 2) < 1 ? 1 : 1 + IntRac(n, (guess + n / guess) / 2);
  }
}
