class Spiralizor {
  static int[][] spiralize(int size) {
    int[][] spiral = new int[size][size--];
    int col = 0, row = 0;
    while (row <= size) {
      for (int c = col, r = row; r <= size; c++, r++) {
        spiral[row][c] = 1;
        spiral[r][size] = 1;
      }

      if (col > 0) col++;
      if (row == size - 1) break;

      for (int i = size - 1; i >= col; i--) {
        spiral[size][i] = 1;
      }
      for (int i = size - 1; i >= row + 2; i--) {
        spiral[i][col] = 1;
      }

      col++;
      row += 2;
      size -= 2;
    }
    return spiral;
  }
}
