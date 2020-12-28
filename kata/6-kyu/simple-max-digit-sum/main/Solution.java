interface Solution {
  static long solve(long n) {
    long power = (long) Math.pow(10, (n + "").length() - 1.);
    long last = power * (n / power + 1) - 1;
    return last > n + 1 ? last - (long) Math.pow(10, (last - n + "").length()) : Math.min(last, n);
  }
}