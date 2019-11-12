class Kata {
  static int dutyFree(int normPrice, int discount, int hol) {
    return hol * 100 / (normPrice * discount);
  }
}
