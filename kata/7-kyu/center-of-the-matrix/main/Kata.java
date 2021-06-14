interface Kata {
  static Integer center(int[][] m) {
    return m.length % 2 > 0 && m[0].length % 2 > 0 ? m[m.length / 2][m[0].length / 2] : null;
  }
}