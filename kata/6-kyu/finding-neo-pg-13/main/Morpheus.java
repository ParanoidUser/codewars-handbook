class Morpheus {
  int[] find(Matrix matrix, int neo) {
    for (int x = 0, y = matrix.size() - 1, e; x < matrix.size() && y >= 0; x += e < neo ? 1 : 0, y -= e > neo ? 1 : 0) {
      if ((e = matrix.get(x, y)) == neo) {
        return new int[]{x, y};
      }
    }
    return new int[0];
  }
}