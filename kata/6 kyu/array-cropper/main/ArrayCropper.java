class ArrayCropper {
  static int[][] getCroppedFieldAsArray(int[][] src) {
    int up = -1, down = src.length, left = -1, right = src[0].length;
    for (int i = 0; i < src.length; i++) {
      for (int j = 0; j < src[i].length; j++) {
        if (src[i][j] == 1) {
          if (i < down) down = i;
          if (i > up) up = i;
          if (j < right) right = j;
          if (j > left) left = j;
        }
      }
    }
    int[][] trimmed = new int[up - down + 1][left - right + 1];
    for (int i = down, j = 0; i <= up; i++) {
      System.arraycopy(src[i], right, trimmed[j++], 0, left - right + 1);
    }
    return trimmed;
  }
}
