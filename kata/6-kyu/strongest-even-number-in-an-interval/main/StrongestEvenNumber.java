interface StrongestEvenNumber {
  static int strongestEven(int n, int m) {
    for (; n <= (m & (m - 1)); m &= --m);
    return m;
  }
}
