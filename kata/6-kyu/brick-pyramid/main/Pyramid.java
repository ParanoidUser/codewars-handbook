class Pyramid {
  static double weight(int row, int pos) {
    if (pos < 0 || pos > row) {
      return 0;
    }
    if (row == 1) {
      return .5;
    }

    double right = weight(--row, pos) / 2;
    if (right > 0) {
      right += .5;
    }

    double left = weight(row, --pos) / 2;
    if (left > 0) {
      left += .5;
    }
    return left + right;
  }
}
