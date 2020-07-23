class Morpheus {
  int[] find(Matrix matrix, int neo) {
    for (int x = 0, y = matrix.size() - 1, e; x < matrix.size();) {
      if ((e = matrix.get(x, y)) == neo) {
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