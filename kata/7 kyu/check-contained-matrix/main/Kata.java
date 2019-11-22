class Kata {
  static int[] checkIsContained(int[][] mat1, int mat2[][]) {
    for (int y = 0; y < mat1.length - 2; y++) {
      ROW:
      for (int x = 0; x < mat1[0].length - 2; x++) {
        for (int z = 0; z < 3; z++) {
          if (mat1[y + z][x + z] != mat2[z][z]) continue ROW;
        }
        return new int[] {y, x};
      }
    }
    return new int[] {-1, -1};
  }
}
