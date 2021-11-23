interface Solution {
  static long sumCubes(double n) {
    return (long) Math.pow(n + n * n, 2) / 4L;
  }
}