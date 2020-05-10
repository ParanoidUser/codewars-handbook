interface Kata {
  static int dutyFree(int normPrice, int discount, int hol) {
    return 100 * hol / (normPrice * discount);
  }
}
