interface ArrayCropper {
  static int[][] getCroppedFieldAsArray(int[][] src) {
    int up = 0;
    int down = src.length;
    int left = 0;
    int right = src[0].length;
    for (var i = 0; i < src.length; i++) {
      for (var j = 0; j < src[i].length; j++) {
        if (src[i][j] == 1) {
          up = Math.max(up, i);
          down = Math.min(down, i);
          left = Math.max(left, j);
          right = Math.min(right, j);
        }
      }
    }

    var trimmed = new int[up - down + 1][left - right + 1];
    int j = 0;
    for (int i = down; i <= up; i++) {
      System.arraycopy(src[i], right, trimmed[j++], 0, left - right + 1);
    }
    return trimmed;
  }
}
