interface Pyramid {
  static double weight(int row, int pos) {
    double sum = 0;
    double half = 1;
    for (var i = 0; i < row; i++) {
      half /= 2;
      sum += half;
    }
    return pos > 0 && pos != row ? (row * (row + 1) / 2. - 2 * sum) / --row : sum;
  }
}
