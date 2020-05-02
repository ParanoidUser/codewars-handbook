interface Dinglemouse {
  static int[] humanYearsCatYearsDogYears(int y) {
    return new int[] {y, y > 1 ? 16 + 4 * y : 15, y > 1 ? 14 + 5 * y : 15};
  }
}
