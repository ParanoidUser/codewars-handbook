interface Tetris {
  static boolean[][] Rotate(boolean[][] block) {
    var rotated = new boolean[block[0].length][block.length];
    for (int i = 0; i < block.length; i++) {
      for (int j = 0; j < block[i].length; j++) {
        rotated[j][block.length - i - 1] = block[i][j];
      }
    }
    return rotated;
  }
}