interface SudokuValidator {
  static boolean validate(int[][] board) {
    for (int i = 0; i < board.length; i++) {
      int bits = 0;
      for (int j = 0; j < board.length; j++) {
        bits |= 1 << board[3 * i % 3 + j % 3][j / 3];
        bits |= 1 << board[i][j] + 9;
        bits |= 1 << board[j][i] + 18;
      }
      if (bits != 268435454) {
        return false;
      }
    }
    return true;
  }
}