class Morpheus {
  int[] find(Matrix matrix, int neo) {
    int x = 0;
    int y = matrix.size() - 1;
    while (x < matrix.size()) {
      int e = matrix.get(x, y);
      if (e == neo) {
        return new int[]{x, y};
      }
      if (e < neo) {
        x++;
      } else {
        y--;
      }
    }
    return new int[0];
  }
}