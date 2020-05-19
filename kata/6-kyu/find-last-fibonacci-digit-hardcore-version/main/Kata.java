interface Kata {
  static int lastFibDigit(int n) {
    return "011235831459437077415617853819099875279651673033695493257291".charAt(n % 60) - 48;
  }
}