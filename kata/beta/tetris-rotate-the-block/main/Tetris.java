interface Tetris {
  static boolean[][] Rotate(boolean[][] block) {
    var rotated = new boolean[block[0].length][block.length];
    for (var i = 0; i < block.length; i++) {
      for (var j = 0; j < block[i].length; j++) {
        rotated[j][block.length - i - 1] = block[i][j];
      }
    }
    return rotated;
  }
}