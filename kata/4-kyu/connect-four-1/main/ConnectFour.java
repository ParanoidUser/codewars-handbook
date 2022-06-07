import java.util.List;

interface ConnectFour {
  static String whoIsWinner(List<String> piecesPositionList) {
    var board = new String[7][6];
    for (String piece : piecesPositionList) {
      int column = piece.charAt(0) - 65;
      int row = 0;
      while (row < board[column].length - 1 && board[column][row] != null) {
        row++;
      }

      board[column][row] = piece.substring(2);
      for (var step : new int[][] {{0, 1}, {1, 0}, {1, 1}, {1, -1}}) {
        var result = move(column, row, step, board[column][row], board);
        if (!result.isEmpty()) {
          return result;
        }
      }
    }
    return "Draw";
  }

  private static String move(int column, int row, int[] step, String piece, String[][] board) {
    int n = 0;
    for (int f = 1; f > -2; f -= 2) {
      for (int c = column, r = row;
          c >= 0 && c < board.length && r >= 0 && r < board[c].length && piece.equals(board[c][r]);
          c += step[0] * f, r += step[1] * f) {
        if (++n > 4) {
          return piece;
        }
      }
    }
    return "";
  }
}
