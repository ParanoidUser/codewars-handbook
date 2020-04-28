interface Kata {
  static String datingRange(int age) {
    return age > 14 ? age / 2 + 7 + "-" + (age - 7) * 2 : (int) (.9 * age) + "-" + (int) (1.1 * age);
  }
}
