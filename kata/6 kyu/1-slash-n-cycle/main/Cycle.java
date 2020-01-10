class Cycle {
  static int cycle(int n) {
    if (n % 2 == 0 || n % 5 == 0) return -1;

    int c = 1, m = 1;
    while ((m = 10 * m % n) != 1) c++;
    return c;
  }
}
