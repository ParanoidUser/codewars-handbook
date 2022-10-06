interface Carbon {
  static double dating(int n0, int t) {
    return Math.round(n0 * Math.exp(-1.21605E-4 * t) * 100) / 100.;
  }
}