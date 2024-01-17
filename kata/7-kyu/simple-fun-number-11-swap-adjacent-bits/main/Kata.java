interface Kata {
  static int swapAdjacentBits(int n) {
    return (n & 0xAAAAAAAA) >> 1 | (n & 0x55555555) << 1;
  }
}