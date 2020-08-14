interface Kata {
  static int[] addingShifted(int[][] arrayOfArrays, int shift) {
    int[] result = new int[(arrayOfArrays.length - 1) * shift + arrayOfArrays[0].length];
    for (int i = 0; i < arrayOfArrays.length; i++) {
      for (int j = 0; j < arrayOfArrays[i].length; j++) {
        result[i * shift + j] += arrayOfArrays[i][j];
      }
    }
    return result;
  }
}
