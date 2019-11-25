class TitleToNumber {
  static long titleToNumber(String title) {
    long sum = 0;
    for (char c : title.toCharArray()) {
      sum = sum * 26 + c - 64;
    }
    return sum;
  }
}
