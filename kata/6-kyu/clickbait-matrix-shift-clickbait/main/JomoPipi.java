interface JomoPipi {
  static char[][] shift(char[][] m, int n) {
    var shifted = new char[m.length][m[0].length];
    for (int r = m.length, c = m[0].length, i = 0; i < r * c; i++) {
      shifted[(i + n) / c % r][(i + n) % c] = m[i / c][i % c];
    }
    return shifted;
  }
}