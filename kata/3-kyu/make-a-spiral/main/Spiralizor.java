interface Spiralizor {
  static int[][] spiralize(int size) {
    var spiral = new int[size][size];
    for (var i = 0; i < size; i++) {
      for (var j = 0; j < size; j++) {
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
