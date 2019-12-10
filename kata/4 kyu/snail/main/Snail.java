class Snail {
  static int[] snail(int[][] array) {
    if (array[0].length == 0) return new int[0];

    int i = 0, result[] = new int[array.length * array.length];
    for (int x = 0, y = 0, l = array.length - 1; l / 2 >= 0; l -= 2, x++, y++) {
      for (int j = 0; j < l; j++) result[i++] = array[x][y++];
      for (int j = 0; j < l; j++) result[i++] = array[x++][y];
      for (int j = 0; j < l; j++) result[i++] = array[x][y--];
      for (int j = 0; j < l; j++) result[i++] = array[x--][y];
    }
    if (array.length % 2 != 0) result[i] = array[array.length / 2][array.length / 2];
    return result;
  }
}
