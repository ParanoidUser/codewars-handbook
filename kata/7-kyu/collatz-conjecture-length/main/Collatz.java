interface Collatz {
  static long conjecture(long x) {
    long count = 2;
    while ((x = x % 2 == 0 ? x / 2 : x * 3 + 1) != 1) {
      count++;
    }
    return count;
  }
}
