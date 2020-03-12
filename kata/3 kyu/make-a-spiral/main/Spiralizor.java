class Spiralizor {
  static int[][] spiralize(int size) {
    int[][] spiral = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        int m = 1 - Math.min(Math.min(i, j), size - 1 - Math.max(i, j)) % 2;
        spiral[i][j] = i == j + 1 && 2 * i < size ? j % 2 : m;
      }
    }
    if (size % 2 == 0) {
      spiral[size / 2][size / 2 - 1] = 0;
    }
    return spiral;
  }
}
