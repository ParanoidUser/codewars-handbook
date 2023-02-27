interface SudokuValidator {
  static boolean check(int[][] sudoku) {
    for (int i = 0; i < sudoku.length; i++) {
      int bits = 0;
      for (int j = 0; j < sudoku.length; j++) {
        bits |= 1 << sudoku[3 * i % 3 + j % 3][j / 3];
        bits |= 1 << sudoku[i][j] + 9;
        bits |= 1 << sudoku[j][i] + 18;
      }
      if (bits != 268435454) {
        return false;
      }
    }
    return true;
  }
}