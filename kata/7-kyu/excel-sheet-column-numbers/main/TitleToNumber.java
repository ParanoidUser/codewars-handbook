interface TitleToNumber {
  static long titleToNumber(String title) {
    return title.chars().mapToLong(c -> c).reduce(0, (s, c) -> 26 * s + c - 64);
  }
}
