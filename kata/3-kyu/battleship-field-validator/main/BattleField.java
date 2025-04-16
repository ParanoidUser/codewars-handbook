import static java.util.stream.IntStream.range;

interface BattleField {
  static boolean fieldValidator(int[][] field) {
    return range(0, 10).flatMap(r -> range(0, 10).map(c -> size(field, r, c))).reduce(0, Integer::sum) == 1234;
  }

  private static int size(int[][] field, int row, int col) {
    int size = 1;
    while (col < 9 && field[row][col + 1] == 1 && col + size < 10 && field[row][col + size] == 1 ||
           row < 9 && field[row + 1][col] == 1 && row + size < 10 && field[row + size][col] == 1) {
      size++;
    }
    return isValid(field, row, col, row < 9 && field[row + 1][col] == 1, size) ? (int) Math.pow(10, size - 1.) : 0;
  }

  private static boolean isValid(int[][] field, int row, int col, boolean vertical, int size) {
    for (int r = Math.max(row - 1, 0); r <= Math.min(vertical ? row + size : row + 1, 9); r++) {
      for (int c = Math.max(col - 1, 0); c <= Math.min(vertical ? col + 1 : col + size, 9); c++) {
        if (field[r][c] == 1 && !(r == row && c == col ||
            col + size > c && r == row && c >= col ||
            row + size > r && c == col && r >= row)) {
          return false;
        }
      }
    }
    return field[row][col] == 1;
  }
}