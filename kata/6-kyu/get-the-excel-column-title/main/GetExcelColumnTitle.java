interface GetExcelColumnTitle {
  static String getColumnTitle(int num) {
    if (num-- < 1) {
      throw new IllegalArgumentException();
    }
    return (num < 26 ? "" : getColumnTitle(num / 26)) + (char) (num % 26 + 'A');
  }
}