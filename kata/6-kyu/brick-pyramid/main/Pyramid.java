interface Pyramid {
  static double weight(int row, int pos) {
    double sum = 0, half = 1;
    for (var i = 0; i < row; i++) {
      sum += half /= 2;
    }
    return pos > 0 && pos != row ? (row * (row + 1) / 2. - 2 * sum) / --row : sum;
  }
}
