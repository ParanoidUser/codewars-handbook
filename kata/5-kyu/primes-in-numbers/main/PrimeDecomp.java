interface PrimeDecomp {
  static String factors(int n) {
    var factors = new StringBuilder();
    for (int f = 2; f <= n; f++) {
      int e = 0;
      while (n % f == 0) {
        n /= f;
        e++;
      }
      if (e > 0) {
        factors.append("(").append(f).append(e > 1 ? "**" + e : "").append(")");
      }
    }
    return factors.toString();
  }
}