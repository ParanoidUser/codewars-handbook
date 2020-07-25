interface Kata {
  static boolean isPronic(long n) {
    long sqr = (long) Math.sqrt(n);
    return sqr * ++sqr == n;
  }
}
