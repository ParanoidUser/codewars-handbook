interface Multiplier {
  static long multiply(long a, long b) {
    return Math.multiplyExact(a, b);
  }
}