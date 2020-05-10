interface NoBoring {
  static int noBoringZeros(int n) {
    return n == 0 || n % 10 != 0 ? n : noBoringZeros(n / 10);
  }
}
