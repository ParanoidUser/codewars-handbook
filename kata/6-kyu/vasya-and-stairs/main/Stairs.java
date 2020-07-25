interface Stairs {
  static int NumberOfSteps(int n, int m) {
    return n++ < m ? -1 : (n / 2 - 1 + m) / m * m;
  }
}
