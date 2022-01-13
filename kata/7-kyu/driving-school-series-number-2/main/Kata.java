interface Kata {
  static int cost(int mins) {
    return 10 * Math.max(3, (mins + 54) / 30);
  }
}