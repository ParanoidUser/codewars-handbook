interface Kata {
  static String usdcny(double usd) {
    return String.format("%.2f Chinese Yuan", 6.75 * usd);
  }
}