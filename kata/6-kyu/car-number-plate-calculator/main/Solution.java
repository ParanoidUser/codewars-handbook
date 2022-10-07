interface Solution {
  static String findTheNumberPlate(int id) {
    return String.format("%c%c%c%03d", id / 999 % 26 + 'a', id / 25974 % 26 + 'a', id / 675324 % 26 + 'a', id % 999 + 1);
  }
}
