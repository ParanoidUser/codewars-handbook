interface Kata {
  static boolean cyclops(long n) {
    return Long.toBinaryString(n).matches("(1+)0\\1");
  }
}