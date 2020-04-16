class MaxRotate {
  static long maxRot(long n) {
    String digits = "" + n;
    long max = n;
    for (int i = 1; i < digits.length(); i++) {
      digits = digits.substring(0, i - 1) + digits.substring(i) + digits.substring(i - 1, i);
      max = Math.max(max, Long.parseLong(digits));
    }
    return max;
  }
}
