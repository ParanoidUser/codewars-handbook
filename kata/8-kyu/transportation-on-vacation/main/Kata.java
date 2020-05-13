interface Kata {
  static int rentalCarCost(int d) {
    return 40 * d - (d > 6 ? 50 : d > 2 ? 20 : 0);
  }
}
