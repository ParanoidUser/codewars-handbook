import static java.util.stream.IntStream.range;

interface BattleField {
  static boolean fieldValidator(int[][] field) {
    return range(0, 10).flatMap(r -> range(0, 10).map(c -> size(field, r, c))).reduce(0, Integer::sum) == 1234;
  }

  private static int size(int[][] field, int row, int col) {
    int axis = col < 9 && field[row][col + 1] == 1 ? 1 : row < 9 && field[row + 1][col] == 1 ? -1 : 0;
    int size = 1;
    while (axis > 0 && col + size < 10 && field[row][col + size] == 1 || // horizontal
           axis < 0 && row + size < 10 && field[row + size][col] == 1) { // vertical
      size++;
    }
    return isValid(field, row, col, axis, size) ? (int) Math.pow(10, size - 1.) : 0;
  }

  private static boolean isValid(int[][] field, int row, int col, int axis, int size) {
    for (int r = Math.max(row - 1, 0); r <= Math.min(axis < 0 ? row + size : row + 1, 9); r++) {
      for (int c = Math.max(col - 1, 0); c <= Math.min(axis > 0 ? col + size : col + 1, 9); c++) {
        if (field[r][c] == 1 && !(axis > 0 && col + size > c && r == row && c >= col ||
                                  axis < 0 && row + size > r && c == col && r >= row ||
                                  axis == 0 && r == row && c == col)) {
          return false;
        }
      }
    }
    return field[row][col] == 1;
  }
}