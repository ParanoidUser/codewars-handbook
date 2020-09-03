interface Arge {
  static int nbYear(int p0, double percent, int aug, int p) {
    return p0 < p ? nbYear((int) (p0 * (percent / 100 + 1) + aug), percent, aug, p) + 1 : 0;
  }
}
