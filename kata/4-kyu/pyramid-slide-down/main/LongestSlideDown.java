interface LongestSlideDown {
  static int longestSlideDown(int[][] pyramid) {
    for (int i = pyramid.length - 1; i > 0; i--) {
      for (int j = 0; j < pyramid[i].length - 1; j++) {
        pyramid[i - 1][j] += Math.max(pyramid[i][j], pyramid[i][j + 1]);
      }
    }
    return pyramid[0][0];
  }
}