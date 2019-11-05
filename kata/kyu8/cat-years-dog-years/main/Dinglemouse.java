class Dinglemouse {
  static int[] humanYearsCatYearsDogYears(int y) {
    return new int[] {y, y == 1 ? 15 : 16 + 4 * y, y == 1 ? 15 : 14 + 5 * y};
  }
}
