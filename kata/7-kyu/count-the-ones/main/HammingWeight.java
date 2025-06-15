interface HammingWeight {
  static int hammingWeight(int i) {
    return Integer.bitCount(i);
  }
}